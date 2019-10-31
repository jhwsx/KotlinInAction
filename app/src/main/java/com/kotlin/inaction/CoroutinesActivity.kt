package com.kotlin.inaction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coroutines.buttonCropImage
import kotlinx.android.synthetic.main.activity_coroutines.buttonGetImage

/**
 * @author wangzhichao
 * @date 2019/10/30
 */
class CoroutinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
        buttonGetImage.setOnClickListener {
            startActivity(Intent(this, CoroutinesGetImageActivity::class.java))
        }
        buttonCropImage.setOnClickListener {
            startActivity(Intent(this, CoroutinesCropImageActivity::class.java))
        }
    }
}