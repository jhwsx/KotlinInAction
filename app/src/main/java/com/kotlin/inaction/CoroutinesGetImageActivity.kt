package com.kotlin.inaction

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines_get_image.*
import kotlinx.coroutines.*
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

/**
 * @author wangzhichao
 * @date 2019/10/31
 */
class CoroutinesGetImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_get_image)
        var counter = 0
        btn_click.setOnClickListener {
            counter++
            ToastUtils.showToast(this, counter.toString())
        }

        // 不用协程
//        Thread {
//            // 切换到后台线程
//            val bitmapDrawable = BitmapDrawable(resources, getImage(url))
//            runOnUiThread {
//                // 切换到前台线程
//                iv.background = bitmapDrawable
//                pb.visibility = View.GONE
//            }
//        }.start()

        //----------------------------协程方式--------------------------------
        // 下面这样写法虽然不会报错，但是不好，为什么呢？
        // 和不用协程的方式相比，一点儿没有简化，照样需要手动切换到后台线程，再手动切换到前台线程
//        val coroutineScope = CoroutineScope(Dispatchers.IO) // 切到后台线程
//        coroutineScope.launch { // 开启协程，协程就是花括号包裹的代码
//            val bitmapDrawable = BitmapDrawable(resources, getImage(url))
//            launch(Dispatchers.Main) { // 切到前台线程
//                iv.background = bitmapDrawable
//                pb.visibility = View.GONE
//            }
//        }

        // 下面这种写法是好的
        // 原因就是这里使用了 withContext 函数，它的作用是可以切换到指定的线程，并在闭包内的逻辑结束之后，自动把线程切回去继续执行。
        // 特别注意的是：“自动”这两个字。自动切回来，所以就可以少一层嵌套。
        // 自动切回来 n 次，就可以少 n 层嵌套。
//        val coroutineScope = CoroutineScope(Dispatchers.Main) // 这种方式是推荐的，可以通过 context 参数来控制和管理协程的生命周期
//        coroutineScope.launch {
//        // GlobalScope.launch { // 不能使用这种方式, GlobalScope 是一个单例对象
//            Log.d(TAG, "0,threadName=${Thread.currentThread().name}") // threadName=main
//            val bitmapDrawable = withContext<BitmapDrawable>(Dispatchers.IO) {
//                Log.d(TAG, "1,threadName=${Thread.currentThread().name}") // threadName=DefaultDispatcher-worker-1
//                BitmapDrawable(resources, getImage(url))
//            }
//            Log.d(TAG, "2,threadName=${Thread.currentThread().name}") // threadName=main
//            iv.background = bitmapDrawable
//            pb.visibility = View.GONE
//        }

        // 把 withContext 的部分放进一个单独的函数里进行封装，使代码流程更加清晰
        val coroutineScope = CoroutineScope(Dispatchers.Main) // 这种方式是推荐的，可以通过 context 参数来控制和管理协程的生命周期
        coroutineScope.launch {
            // GlobalScope.launch { // 不能使用这种方式, GlobalScope 是一个单例对象
            Log.d(TAG, "0,threadName=${Thread.currentThread().name}") // threadName=main
            val bitmapDrawable = getImage()
            Log.d(TAG, "2,threadName=${Thread.currentThread().name}") // threadName=main
            iv.background = bitmapDrawable
            pb.visibility = View.GONE
        }

    }
    // IDE 报错：Suspend function'withContext' should be called only from a coroutine or another suspend funcion
    // withContext 下会有红色的波浪线
    // 这是因为 withContext 是一个 suspend 函数，它只能要么在协程里调用，要么在另一个 suspend 函数里调用。
//    fun getImage() = withContext<BitmapDrawable>(Dispatchers.IO) {
//        Log.d(TAG, "1,threadName=${Thread.currentThread().name}") // threadName=DefaultDispatcher-worker-1
//        BitmapDrawable(resources, getImage(url))
//    }
    // 只需要在函数声明上加上 suspend 关键字就可以了
    suspend fun getImage() = withContext<BitmapDrawable>(Dispatchers.IO) {
        Log.d(TAG, "1,threadName=${Thread.currentThread().name}") // threadName=DefaultDispatcher-worker-1
        BitmapDrawable(resources, getImage(url))
    }
    // 看一下上面请求网络上的图片并展示的代码，没有使用回调，就实现了线程切换，看起来好像我们仍在主线程一样。
    // 本来是异步的代码却用同步的方式写了出来。

    private fun getImage(link: String): Bitmap? {
        // 模拟网络请求延时，不然太快了。
        Thread.sleep(3000L)
        val url = URL(link)
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.requestMethod = "GET"
        httpURLConnection.readTimeout = 6 * 1000
        if (httpURLConnection.responseCode == 200) {
            val inputStream = httpURLConnection.inputStream
            val bytes = readStream(inputStream)
            val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            Log.d(TAG, "bitmap: width=${bitmap.width}, height=${bitmap.height}, size=${bitmap.byteCount}")
            return bitmap
        }
        return null
    }

    private fun readStream(inputStream: InputStream): ByteArray {
        val baos = ByteArrayOutputStream()
        val buffer = ByteArray(1024)
        var length: Int = inputStream.read(buffer)
        while (length != -1) {
            baos.write(buffer, 0, length)
            length = inputStream.read(buffer)
        }
        inputStream.close()
        baos.close()
        return baos.toByteArray()
    }

    companion object {
        private const val TAG = "CoroutinesGetImage"
        // 这是本地 tomcat 上的一张图片
        private val url = "http://172.16.40.14:8080/dog1.jpg"
    }
}