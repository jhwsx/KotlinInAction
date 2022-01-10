package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/9
 */
fun String.filter(predicate:(Char) -> Boolean):String {
    val sb = StringBuilder()
    for (it in this) {
        if (predicate(it)) {
            sb.append(it)
        }
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    val str = "abc123"
    println(str.filter { it in 'a'..'z' })
}
/*
abc
 */
/**
 * 总结：
 */