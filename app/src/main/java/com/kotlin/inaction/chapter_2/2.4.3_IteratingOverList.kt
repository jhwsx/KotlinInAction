package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun main(args: Array<String>) {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}
/**
 * 总结：
 * 1，for 循环的展开语法在迭代集合的同时跟踪当前项的下标
 */