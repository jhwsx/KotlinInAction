package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/8
 */
fun twoAndThree(operation: (Int, Int) -> Int) { // 这里是定义一个名字为 operation 的函数类型的参数
    val result = operation(2, 3)
    println("The result is $result")
}

fun main(args: Array<String>) {
    twoAndThree { a, b -> a + b }
    twoAndThree { x, y -> x * y }
}

/**
 * 总结：
 * 1，这里是调用作为参数的函数类型的例子：也就是说把函数类型作为参数来传递。
 * 2，lambda 表达式中的 a，b 都是形参。
 */