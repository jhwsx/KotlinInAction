package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/11
 */
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance1<String>())
}


inline fun <reified T> Iterable<*>.filterIsInstance1(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}