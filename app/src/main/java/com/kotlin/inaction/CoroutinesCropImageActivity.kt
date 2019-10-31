package com.kotlin.inaction

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines_crop_image.iv1
import kotlinx.android.synthetic.main.activity_coroutines_crop_image.iv2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

/**
 * @author wangzhichao
 * @date 2019/10/31
 */
class CoroutinesCropImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_crop_image)
        val coroutineScope = CoroutineScope(Dispatchers.Main)
        coroutineScope.launch(Dispatchers.IO) {
            Log.d(TAG, "1,threadName=${Thread.currentThread().name}") // main
            val bitmap = withContext(Dispatchers.IO) {
                Log.d(TAG, "2,threadName=${Thread.currentThread().name}") // DefaultDispatcher-worker-1
                getImage(url)
            }
            Log.d(TAG, "3,threadName=${Thread.currentThread().name}") // main
            bitmap?.let {
                val b1 = withContext(Dispatchers.IO) {
                    Log.d(TAG, "4,threadName=${Thread.currentThread().name}") // DefaultDispatcher-worker-2
                    cropBitmap(it, 2,2,1,1)
                }
                Log.d(TAG, "5,threadName=${Thread.currentThread().name}") // main
                iv1.setImageBitmap(b1)
                val b2 = withContext(Dispatchers.IO) {
                    Log.d(TAG, "6,threadName=${Thread.currentThread().name}") // DefaultDispatcher-worker-2
                    cropBitmap(it, 3,3,2,2)
                }
                Log.d(TAG, "7,threadName=${Thread.currentThread().name}") // main
                iv2.setImageBitmap(b2)
            }
        }
    }

    private fun cropBitmap(bitmap: Bitmap, sliceX: Int, sliceY: Int, posX: Int, posY: Int): Bitmap {
        val cropWidth = bitmap.width / sliceX
        val cropHeight = bitmap.height / sliceY
        val x = cropWidth * posX
        val y = cropHeight * posY
        return Bitmap.createBitmap(bitmap, x, y, cropWidth, cropHeight)
    }

    private fun getImage(link: String): Bitmap? {
        val url = URL(link)
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.requestMethod = "GET"
        httpURLConnection.readTimeout = 6 * 1000
        if (httpURLConnection.responseCode == 200) {
            val inputStream = httpURLConnection.inputStream
            val bytes = readStream(inputStream)
            val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            Log.d(TAG, "bitmap: width=${bitmap.width}, height=${bitmap.height}, size=${bitmap.byteCount}"
            )
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
        private const val TAG = "CoroutinesCropImage"
        private val url = "http://172.16.40.10:8080/dog1.jpg"
    }
}