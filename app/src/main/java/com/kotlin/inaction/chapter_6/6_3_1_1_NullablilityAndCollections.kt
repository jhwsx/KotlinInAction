package com.kotlin.inaction.chapter_6

import java.io.BufferedReader
import java.io.StringReader

/**
 *
 * @author wzc
 * @date 2019/3/19
 */
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for(number in numbers) { // 注意这里的 number 的类型是 Int?, 原因是形参的集合元素可空
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun addValidNumber2(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    val invalidNumbers = numbers.size - validNumbers.size
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: $invalidNumbers")
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    println(numbers)

    addValidNumbers(numbers)

    addValidNumber2(numbers)
}

/**
 * 总结：
 * 1，List<Int?> 与 List<Int>? 的区别是什么？
 * 前者是集合的元素可空，而集合不可空；后者是集合的元素不可空，而集合可空。
 * 2，List<Int?>? 怎么解释？
 * 集合的元素可空，而且集合可空。
 */