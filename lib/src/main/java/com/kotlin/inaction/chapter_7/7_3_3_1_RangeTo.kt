package com.kotlin.inaction.chapter_7

import java.time.LocalDate

/**
 *
 * @author wzc
 * @date 2019/4/11
 */
fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
    println(now.plusWeeks(2) in vacation)

}

/**
 * 总结：
 * 1，这里 .. 运算符实际上调用的是 Ranges.kt 中的
 * public operator fun <T : Comparable<T>> T.rangeTo(that: T): ClosedRange<T> = ComparableRange(this, that)
 */