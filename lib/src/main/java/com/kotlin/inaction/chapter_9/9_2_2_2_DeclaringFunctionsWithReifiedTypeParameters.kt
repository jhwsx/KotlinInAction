package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/7
 */
// 一个简单的带实化类型参数的函数
// 需要 inline 修饰函数，需要 reified 修饰类型参数
// 共同保证类型实参在运行时是已知的。
inline fun <reified T> isB(value: Any) = value is T

fun main(args: Array<String>) {
    println(isB<String>(12345))
}

/**
 * 总结：
 * 1,这个例子展示：把 isB 声明成 inline 并且用 reified 标记类型参数，
 * 就能够在函数体中决定调用它用的类型实参
 */