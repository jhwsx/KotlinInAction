package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
class Button : View(){

}

open class View {
   var listener: View.OnClickListener
    set(value: View.OnClickListener) {
        this.listener = value
    }
    get() {
        return listener
    }

    fun setOnClickListener(listener: () -> Unit) {

    }

    interface OnClickListener {
        fun onClick(v: View)
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.setOnClickListener{
        println("aaaa")
    }

}