package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/7
 */
inline fun <reified T> isB(value: Any) = value is T

inline fun <reified T: Number> isNumber(value: Any) = value is T
fun main(args: Array<String>) {
    println(isB<String>("abcde"))
    println(isB<String>(12345))
    println(isNumber<Int>(1))
}
/**
 * 总结：
 * 1,这个例子展示：把 isB 声明成 inline 并且用 reified 标记类型参数，
 * 就能够在函数体重决定调用它用的类型实参
 */