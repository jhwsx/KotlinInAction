package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/9
 */
// 以一个判断式作为参数，判断式的类型是一个函数，以字符作为参数并返回 Boolean 类型的值。
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