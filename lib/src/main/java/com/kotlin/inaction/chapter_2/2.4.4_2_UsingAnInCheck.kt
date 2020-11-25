package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter"
        else -> "I don't know..."
    }

fun main(args: Array<String>) {
    println(recognize('a'))
}
/**
 * 总结：
 * 1，in 运算符 和 !in 运算符用于 when 表达式
 */
