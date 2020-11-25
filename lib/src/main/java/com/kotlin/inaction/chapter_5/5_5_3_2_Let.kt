package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    // 不使用 let
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)
    // 使用 let
    val numbers1 = mutableListOf("one", "two", "three", "four", "five")
    numbers1.map { it.length }.filter { it > 3 }.let { println(it) }

}
