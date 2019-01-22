package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
open class View {
    open fun click() = println("View clicked")

    open fun showOff() = println("I AM A VIEW")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
}