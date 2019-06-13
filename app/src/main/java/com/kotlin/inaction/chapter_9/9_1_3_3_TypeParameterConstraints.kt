package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}
fun main(args: Array<String>) {
    println(max("kotlin", "java"))
    println(max("kotlin", "objectc"))
    println(max("kotlin", "c"))
    println(max("kotlin", "python"))
//    println(max("kotlin", 42))
}