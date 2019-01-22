package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable4 {
    fun click()
    fun showOff() = println("I'm clicked")
}

open class RichButton2 : Clickable4 {
    final override fun click() {
        println("I was clicked")
    }
}
