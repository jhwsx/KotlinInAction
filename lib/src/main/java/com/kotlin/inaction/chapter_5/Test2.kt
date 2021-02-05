package com.kotlin.inaction.chapter_5

import java.util.Comparator

/**
 * @author wangzhichao
 * @since 2021/1/19
 */

fun main() {
    val map = mapOf("apple" to 8, "banana" to 3, "pear" to 4, "orange" to 4)
    println(map)

    val comparator: Comparator<Int> = Comparator { o1: Int, o2: Int -> Integer.compare(o1, o2) }
    comparator.compare(1, 2)

    val comparator2: Comparator<Int> = Comparator { o1, o2 ->
        println("xxxxx")
        Integer.compare(o1, o2)
    }

}
