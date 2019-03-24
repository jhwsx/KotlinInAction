package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
fun main(args: Array<String>) {
    val list = listOf<String>("a", "b", "c")
    printInUppercase(list)
}

fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}