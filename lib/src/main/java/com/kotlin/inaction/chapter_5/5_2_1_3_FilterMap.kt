package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val newList = list.map { it * it }
    println(newList)

    val newList2 = list.mymap { it * it }
    println(newList2)
}

fun <T, R> Iterable<T>.mymap(transform: (T) -> R): List<R> {
    val result = ArrayList<R>()
    for (item in this) {
        result.add(transform(item))
    }
    return result
}
/**
 * 1，map 函数对集合中的每一个元素应用给定的函数并把结果收集到一个新的集合。
 */