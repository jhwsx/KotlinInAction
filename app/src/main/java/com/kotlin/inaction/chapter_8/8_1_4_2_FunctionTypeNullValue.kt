package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/13
 */
fun <T> Collection<T>.joinToString2(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform:((T) -> String)? = null
):String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        if (transform != null) {
            result.append(transform(element))
        } else {
            result.append(element)
        }

    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta","Release")
    println(letters.joinToString2())
    println(letters.joinToString2 { it.toUpperCase() })
    println(
        letters.joinToString2(
            separator = "! ",
            postfix = "! ",
            transform = { it.toUpperCase() })
    )
}