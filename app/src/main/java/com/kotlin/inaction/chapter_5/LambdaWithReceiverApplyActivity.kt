package com.kotlin.inaction.chapter_5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 *
 * @author wzc
 * @date 2019/2/20
 */
class LambdaWithReceiverApplyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Keep moving"
            textSize = 40.0f
            setPadding(32,32,32,32)

        })
    }
}