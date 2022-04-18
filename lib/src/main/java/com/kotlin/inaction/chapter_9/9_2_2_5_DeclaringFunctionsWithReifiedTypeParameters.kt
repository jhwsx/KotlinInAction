package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/11
 */
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    items.filterIsInstance2<String> {
        println(it)
    }
}

// 这里使用 inline 是为了配合 reified 来实化类型参数的，至于 lambda 参数是不是会内联不是要关心的了。
inline fun <reified T> Iterable<*>.filterIsInstance2(result: (List<T>) -> Unit) {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    result(destination)
}