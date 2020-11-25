package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    println('a' * 3)
}
/**
 * 总结：
 * 1，定义一个返回结果不同的运算符
 *
 */