package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))
}

/**
 * 总结：
 * 1，kotlin 中分割字符串，传入一个 Regex 类型，而不是一个 String 类型。
 * 2，对于简单的分割，可以传入纯文本字符串。
 */