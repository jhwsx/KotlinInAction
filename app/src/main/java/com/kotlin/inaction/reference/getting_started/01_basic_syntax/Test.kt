package com.kotlin.inaction.reference.getting_started.`01_basic_syntax`

/**
 * @author wangzhichao
 * @date 2019/09/09
 */
fun main(args: Array<String>) {
    val items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println(items[index])
    }

    for (i in 0 until items.size) {
        println(items[i])
    }
}