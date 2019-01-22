package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable3 {
    fun click()
    fun showOff() = println("I'm clickable")
}

open class RichButton : Clickable3 {
    fun disable() {}

    open fun animate() {}

    override fun click() {}
}

/**
 * 总结：
 * 1，所有没有特别需要在子类中被重写的类和方法应该被显式地标注为final；
 * 2，java中的类和方法默认是open的，而kotlin中默认都是final的；
 * 3，open 修饰符修饰的类，其他类可以继承它；
 * 4，open 修饰符修饰的方法，在子类中可以重写它；
 * 5，override 修饰符修饰的方法，也是 open的；
 * 6，本类覆写的方法，不再希望子类覆写，可以在 override 前再加 final 修饰符。
 */