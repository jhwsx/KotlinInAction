package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println("map:" + strings.map { it.toList() })
    println("flatMap: " + strings.flatMap { it.toList() })
    val list = listOf(listOf(1, 2), listOf(3, 4))
    println(list.flatten())
    println("flatten:" + list.flatten())

}
