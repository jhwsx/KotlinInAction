package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val newList = list.map { it * it }
    println(newList)
}