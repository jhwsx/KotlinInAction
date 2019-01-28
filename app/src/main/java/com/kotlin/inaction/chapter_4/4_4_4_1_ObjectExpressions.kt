package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
class Window {
    abstract class MouseAdapter() {
        abstract fun mouseClicked()
        abstract fun mouseEntered()
    }
    fun addMouseListener(_adapter: MouseAdapter) {

    }
}

fun main(args: Array<String>) {
    val window = Window()
    window.addMouseListener(object: Window.MouseAdapter() {
        override fun mouseClicked() {

        }

        override fun mouseEntered() {
        }
    })
}

/**
 * 总结：
 * 1，object 关键字用来声明匿名对象；
 * 2，kotlin 的匿名对象和 java 中的匿名内部类的区别是什么？
 * kotlin 的匿名对象可以实现多个接口或者不实现接口；
 * 而 java 的匿名内部类只能扩展一个类或者实现一个接口；
 * kotlin 的对象表达式访问创建它的函数中的变量不用限制是 final 的。
 */