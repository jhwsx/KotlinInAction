package com.kotlin.inaction.chapter_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.kotlin.inaction.R

/**
 *
 * @author wzc
 * @date 2019/2/17
 */
class SAMConstructorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sam_constructors)
        val button1 = findViewById<View>(R.id.button1)
        val button2 = findViewById<View>(R.id.button2)

        val listener = View.OnClickListener {view ->
            val text = when (view.id) {
                R.id.button1 -> "First button"
                R.id.button2 -> "Second button"
                else -> "Unknown button"
            }
            toast(text)
        }
        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
    }

    fun SAMConstructorsActivity.toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}

/**
 * 总结：
 * 1，SAM 构造方法还可以用在需要把 lambda 生成的函数式接口实例存储在一个变量中的情况。
 */