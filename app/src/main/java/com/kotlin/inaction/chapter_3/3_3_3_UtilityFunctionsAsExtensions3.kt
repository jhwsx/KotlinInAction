package com.kotlin.inaction.chapter_3

/**
 * 再写一遍，复习
 * @author wzc
 * @date 2020/6/20
 */
fun <T> Collection<T>.joinToString3(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, value) in withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(value)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf<Int>(1, 2, 3)
    println(list.joinToString3())
    println(list.joinToString3(separator = "| ", prefix = "{", postfix = "}"))
}
