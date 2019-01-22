package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/10
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(",")"))
    println(joinToString(list, separator = ", ",prefix = "{",postfix = "}")) // 这里用的是命名参数
}

/**
 * 总结：
 * 1，kotlin 中使用命名参数，可以增加函数的可读性；
 * 2，命名参数的含义就是当调用一个 kotlin 的函数时，可以显式地标明一些参数的名称；
 * 3，当调用 java 函数时，不能使用命名参数
 */
