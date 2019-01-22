package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable2 {
    fun click()
    fun showOff() = println("I'm clickable!") // 默认实现的方法
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button2 : Clickable2, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button2()
    button.showOff()
    button.setFocus(true)
    button.click()
}

/**
 * 总结：
 * 1，在 kotlin 中，如果同样的继承成员有不止一个实现，必须提供一个显式实现；
 * 2，在实现方法中，可以再调用父类的实现，使用super<父类名>.method()
 */