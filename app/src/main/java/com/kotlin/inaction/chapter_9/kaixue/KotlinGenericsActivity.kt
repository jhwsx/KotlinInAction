package com.kotlin.inaction.chapter_9.kaixue

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
class KotlinGenericsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val textView: TextView = Button(this)

//        val buttons: List<Button> = ArrayList<Button>()
//        val textViews: List<TextView> = buttons // 此行不报错,因为这个 List 是 Kotlin 中的 public interface List<out E> : Collection<E> ,里面有 out 关键字,支持协变

//        val button1: Array<Button> = arrayOf()
//        val textView1: Array<TextView> = button1 // 编译报错: 类型不匹配

//        val textViews: List<TextView> = ArrayList<TextView>()
//        val textViews: List<TextView> = ArrayList<Button>()
//        val textViews: List<TextView> = ArrayList<RadioButton>()

//        val textViews: List<TextView> = ArrayList<Button>()
//        val textView: TextView = textViews.get(0)
//        textViews.add() // Kotlin 中的 List 没有 add 方法

    }
}