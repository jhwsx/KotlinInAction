package com.kotlin.inaction

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = Button(this)
        button.setOnClickListener{
            println(it)
        }

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }

        })

    }
}
