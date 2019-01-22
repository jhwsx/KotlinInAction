package com.kotlin.inaction.chapter_2

import java.io.BufferedReader
import java.io.StringReader

/**
 *
 * @author wzc
 * @date 2019/1/7
 */
fun readNumber3(reader:BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber3(reader)
}