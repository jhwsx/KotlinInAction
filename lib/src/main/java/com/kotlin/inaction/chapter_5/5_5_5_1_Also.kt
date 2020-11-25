package com.kotlin.inaction.chapter_5

/**
 * <pre>
 *     author : wangzhichao
 *     e-mail : wangzhichao@adups.com
 *     time   : 2019/08/18
 *     desc   :
 *     version: 1.0
 * </pre>
 */
fun main(args: Array<String>) {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
    println(numbers)
}