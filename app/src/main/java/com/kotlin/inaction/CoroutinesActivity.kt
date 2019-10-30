package com.kotlin.inaction

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines.iv
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

/**
 * @author wangzhichao
 * @date 2019/10/30
 */
class CoroutinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
        val coroutineScope = CoroutineScope(Dispatchers.Main)
        coroutineScope.launch(context = Dispatchers.Main) {
            val bitmapDrawable = withContext(Dispatchers.IO) {
                Log.d(TAG, "1,threadName=${Thread.currentThread().name}")
                BitmapDrawable.createFromStream(getImage(url), "dog.png")
            }
            Log.d(TAG, "2,threadName=${Thread.currentThread().name}")
            iv.background = bitmapDrawable
        }

    }

    private fun getImage(link: String): InputStream? {
        var result: InputStream? = null
        val url = URL(link)
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.requestMethod = "GET"
        httpURLConnection.readTimeout = 6 * 1000
        if (httpURLConnection.responseCode == 200) {
            result = httpURLConnection.inputStream
        }
        return result
    }

    companion object {
        private const val TAG = "CoroutinesActivity"
        private val url = "http://172.16.40.10:8080/dog.jpg"

    }
}