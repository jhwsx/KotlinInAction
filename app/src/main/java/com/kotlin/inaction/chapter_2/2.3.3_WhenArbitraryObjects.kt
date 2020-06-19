package com.kotlin.inaction.chapter_2

import com.kotlin.inaction.chapter_2.Color.*

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mix(RED, YELLOW))
    println(mix(YELLOW, RED))
    println(mix(BLUE, RED))
}
/*
* 总结：
* 1，when 允许使用任何表达式作为它的分支条件，这比 java 的 switch 要强大的多
* 2，when 表示其他使用的是 else
* 3，setOf 的条目顺序不影响结果的判断，这是因为 set 集合的条目顺序不重要，只要条目是一样的，set
* 就是一样的
* 4，使用 setOf 作为实参，每次都会创建一些 set 实例，这不好*/