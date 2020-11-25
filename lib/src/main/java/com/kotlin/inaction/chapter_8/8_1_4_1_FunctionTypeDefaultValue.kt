package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/13
 */
fun <T> Collection<T>.joinToString1(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform:(T) -> String = {it.toString()}
):String {
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
    println(letters.joinToString1())
    println(letters.joinToString1 { it.toUpperCase() })
    println(
        letters.joinToString1(
            separator = "! ",
            postfix = "! ",
            transform = { it.toUpperCase() })
    )
}