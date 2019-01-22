package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun main(args: Array<String>) {
    val list = listOf(2, 3, 5, 7, 11)
    val list1 = listOf("args: ", *args)
    println(list1)
}