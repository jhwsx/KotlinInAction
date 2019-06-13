package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}
fun main(args: Array<String>) {
    println(oneHalf(3))
    println(oneHalf(3000L))
    println(oneHalf(3.14f))
}