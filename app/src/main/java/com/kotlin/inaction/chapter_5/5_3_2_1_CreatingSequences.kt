package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/17
 */
fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) { it + 1 } // 从 0 开始，依次加 1 ，生成一个序列
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 } // 满足小于 100 的序列
    println(numbersTo100.sum()) // 对序列求和，这是末端操作
}

/**
 * 总结：
 * 1，generateSequence 是位于 Sequences.kt 中的函数，返回一个 Sequence 对象。
 * 2，这里有延期操作，直到调用末端操作的时候才会求值。
 */