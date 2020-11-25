package com.kotlin.inaction.chapter_2

import java.io.BufferedReader
import java.io.StringReader

/**
 *
 * @author wzc
 * @date 2019/1/7
 */
fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        println("ok")
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        println("exception")
        return
    }
    println(number)
}
fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber1(reader)
    readNumber2(reader)
}
/**
 * 总结：
 * 1，try 可以作为表达式，但总是需要用花括号把语句主体括起来
 */
