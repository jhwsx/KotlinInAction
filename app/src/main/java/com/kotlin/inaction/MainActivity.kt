package com.kotlin.inaction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.kotlin.inaction.chapter_5.LambdaWithReceiverApplyActivity
import com.kotlin.inaction.chapter_5.SAMConstructorsActivity
import kotlinx.android.synthetic.main.activity_main.button_coroutines

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener{
//            Log.d("wzc", it.toString())
//        }

//        button.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Log.d("wzc", v.toString())
//            }
//
//        })

        button.setOnClickListener { view ->
            Log.d("wzc", view.toString())
        }
        /**
         * 总结：
         * 1，OnClickListener 是一个函数式接口，即单抽象方法接口，所以才可以采用 view -> ...的形式
         */
        val button_sam_constructors = findViewById<Button>(R.id.button_sam_constructors)
        button_sam_constructors.setOnClickListener {
            startActivity(Intent(this, SAMConstructorsActivity::class.java)) // lambda 中的 this 引用指向的是包围它的类。
        }

        val button_lambda_with_receiver_apply = findViewById<Button>(R.id.button3)
        button_lambda_with_receiver_apply.setOnClickListener {
            startActivity(Intent(this, LambdaWithReceiverApplyActivity::class.java))
        }
        button_coroutines.setOnClickListener {
//            startActivity(Intent(this, CoroutinesActivity::class.java))
//            startActivity<CoroutinesActivity>()
        }
    }
}
