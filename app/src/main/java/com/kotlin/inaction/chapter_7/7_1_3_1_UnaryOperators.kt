package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/3
 */
data class Point4(val x: Int, val y: Int)

operator fun Point4.unaryMinus(): Point4 {
    return Point4(-x, -y)
}

operator fun Point4.unaryPlus():Point4 {
    return Point4(x, y)
}

fun main(args: Array<String>) {
    val p = Point4(19, 91)
    println(p.unaryMinus())
    println(-p)
    println(+p)
}