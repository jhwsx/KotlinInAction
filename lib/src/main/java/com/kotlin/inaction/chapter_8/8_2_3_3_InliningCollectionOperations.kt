package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */

fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    // filter 函数是一个内联函数，这意味着 filter 函数，以及传递给 filter 的 lambda 的字节码都会内联到调用
    // filter 的地方。
    // map 函数也是一个内联函数
    println(people.filter { it.age < 30 }.map(Person1::name))
}
