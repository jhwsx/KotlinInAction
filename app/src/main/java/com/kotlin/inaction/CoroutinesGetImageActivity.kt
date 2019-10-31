package com.kotlin.inaction

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines_get_image.iv
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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
class CoroutinesGetImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_get_image)
        val coroutineScope = CoroutineScope(Dispatchers.Main)
        coroutineScope.launch {
            val bitmapDrawable = withContext(Dispatchers.IO) {
                Log.d(TAG, "1,threadName=${Thread.currentThread().name}")
                BitmapDrawable(resources, getImage(url))
            }
            Log.d(TAG, "2,threadName=${Thread.currentThread().name}")
            iv.background = bitmapDrawable
        }
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
        private val url = "http://172.16.40.10:8080/dog1.jpg"
    }
}