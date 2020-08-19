package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println("map:" + strings.map { it.toList() }) // map:[[a, b, c], [d, e, f]]
    println("flatMap: " + strings.flatMap { it.toList() }) // flatMap: [a, b, c, d, e, f]
    val list = listOf(listOf(1, 2), listOf(3, 4))
    println("flatten:" + list.flatten()) // flatten:[1, 2, 3, 4]

}

/**
 * 总结：
 * flatMap 函数：首先根据实参给定的函数对集合中的每个元素做变换（或者说映射），然后把多个列表合并（或者说平铺）成一个列表。
 * flatten 函数：把多个列表合并（或者说平铺）成一个列表。
 * flatMap 中的 map 是变换的意思，不要理解为集合，这是一个误区。
 */
