package com.kotlin.inaction.chapter_7

import java.time.LocalDate

/**
 *
 * @author wzc
 * @date 2019/4/11
 */
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start
            override fun hasNext() = current <= endInclusive
            override fun next() = current.apply {
                current = plusDays(1)
            }
        }
fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear

    for (dayOff in daysOff) {
        println(dayOff)
    }
}

/**
 * 总结：
 * 1, 实现日期区间的迭代器；
 * 2，CloseRange 是什么作用？代表了一个值的区间，IntRange 就实现了 ClosedRange 这个接口。
 * 3，apply，with 的区别：
 * apply 返回的还是自己，with 返回的是最后一个表达式的值。
 */