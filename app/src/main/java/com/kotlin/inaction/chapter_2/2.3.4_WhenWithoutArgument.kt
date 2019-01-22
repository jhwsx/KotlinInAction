package com.kotlin.inaction.chapter_2

import com.kotlin.inaction.chapter_2.Color.*

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun mixOptimized(c1: Color, c2: Color) =
    when {
    (c1 == RED && c2 == YELLOW) ||
            (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) ||
                (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
}

fun main(args: Array<String>) {
    println(mixOptimized(RED, YELLOW))
    println(mixOptimized(BLUE,RED))
}
/**
 * 总结：
 * 1，这是 when 不带参数的用法，也就是没有参数传入 when
 * 2，没有给 when 提供参数，分支条件就是任意的布尔表达式。
 * 3，避免了使用 setOf 作为参数时，多创建实例的情况。
 */
