package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.mapKeys { "key="+ it.key })
    println(numbers.filterValues { it == "zero" }) // 这里不用再写 it.value
    println(numbers.filterKeys { it === 0 }) // 这里不用再写 it.key
}

/**
 * 总结：
 * 1, 针对 map 的过滤和变换函数：
 * filterKeys 和 mapKeys 过滤和变换 map 的键；
 * filterValues 和 mapValues 过滤和变换 map 的值。
 */