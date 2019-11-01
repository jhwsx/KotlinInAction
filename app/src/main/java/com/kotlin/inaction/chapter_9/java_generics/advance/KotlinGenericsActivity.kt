package com.kotlin.inaction.chapter_9.java_generics.advance

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
class KotlinGenericsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textViews: MutableList<TextView> = ArrayList()
//        val textViews1: MutableList<TextView> = ArrayList<Button>()
    }
}