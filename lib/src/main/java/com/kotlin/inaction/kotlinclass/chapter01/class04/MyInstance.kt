package com.kotlin.inaction.kotlinclass.chapter01.class04

/**
 *
 * @author wangzhichao
 * @since 2022/4/13
 */
object MyInstance {
    fun sayHi() {
        println("Hi")
    }

    @JvmStatic
    fun sayHello() {
        println("Hello")
    }
}