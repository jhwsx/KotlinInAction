package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
fun <T> Collection<T>.joinToString2(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String ="",
    postfix: String=""
) = joinToString2(separator, prefix,postfix)
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(", ", "[", "]"))
    println(list.joinToString(" "))
    println(listOf("one", "two", "three").join(" "))
//    println(listOf(1, 2, 4).join(" ")) // 此行编译报错了
}