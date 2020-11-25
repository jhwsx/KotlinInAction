package com.kotlin.inaction.chapter_2

import java.io.BufferedReader
import java.io.StringReader

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
/**
 * 总结：
 * 1，kotlin 中，throw 结构是一个表达式；
 * 2，kotlin 并不区分受检异常和未受检异常
 */
