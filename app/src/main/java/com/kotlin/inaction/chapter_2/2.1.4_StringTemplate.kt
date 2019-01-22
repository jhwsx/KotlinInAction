package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2018/12/27
 */
fun main(args: Array<String>) {
    val name = "Kotlin"
    println("Hello, $name") // 变量
    val arr = arrayOf("Java", "Android", "Python")
    println("Hello, ${arr[1]}") // 表达式
    println("Hello, ${if (arr.size > 4) arr[0] else "World"}") // 在双引号中直接嵌套双引号
}

/*
字符串模板
 */