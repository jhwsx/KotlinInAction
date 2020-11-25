package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
data class Person2(var name: String, var age: Int = 0, var city: String = "")

fun main(args: Array<String>) {
    val adam = Person2("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)
}
/**
 * 总结：
 * 1, apply 函数是一个扩展函数，通过 this 来获取上下文对象，返回值是对象本身。
 */