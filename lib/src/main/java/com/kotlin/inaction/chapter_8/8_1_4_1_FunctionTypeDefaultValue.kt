package com.kotlin.inaction.chapter_8

import java.util.*

/**
 *
 * @author wzc
 * @date 2019/5/13
 */
fun <T> Collection<T>.joinToString1(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta")
    // 省略整个 lambda，即使用默认参数
    println(letters.joinToString1())
    // 在括号以外传递 lambda
    println(letters.joinToString1 { it.uppercase(Locale.getDefault()) })
    // 以命名参数形式传递 lambda
    println(
        letters.joinToString1(
            separator = "! ",
            postfix = "! ",
            transform = { it.uppercase(Locale.getDefault()) })
    )
}