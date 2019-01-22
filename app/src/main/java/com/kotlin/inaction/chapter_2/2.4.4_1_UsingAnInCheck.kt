package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println("is 'q' a letter? ${isLetter('q')}")
    println("is '|' a letter? ${isLetter('|')}")
    println("is '0' not a digit? ${isNotDigit('0')}")
    println("is '/' not a digit? ${isNotDigit('/')}")
}
/**
 * 总结：
 * 1，使用 in 运算符检查一个值是否在一个区间中
 * 2，使用 !in 运算符检查一个值是否不在一个区间中
 */
