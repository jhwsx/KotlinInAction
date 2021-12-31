package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
val String.lastChar: Char
    get() = this.get(this.length - 1)
var StringBuilder.lastChar: Char
    get() = this.get(this.length - 1)
    set(value: Char) = this.setCharAt(this.length - 1, value)

val <T> List<T>.lastIndex: Int
    get() = this.size - 1

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

/**
 * 总结：
 * 1，kotlin 中可以扩展属性，扩展属性提供了一种方法，用来扩展类的API，可以用来访问
 * 属性，用的是属性语法而不是函数的语法；
 * 2，扩展属性可以没有任何状态；
 * 3，扩展属性必须定义 getter 函数，因为没有支持字段，因此没有默认 getter 的实现；
 * 也不可以初始化，因为没有地方存储初始值。
 * 4, 扩展属性不存在 backing field。
 */