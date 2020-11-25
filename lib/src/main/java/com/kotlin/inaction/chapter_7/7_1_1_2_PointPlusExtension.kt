package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
data class Point2(val x: Int, val y: Int)

operator fun Point2.plus(other: Point2): Point2 {
    return Point2(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    val p1 = Point2(1, 1)
    val p2 = Point2(2, 3)
    val p = p2 + p1
    println(p)
}

/**
 * 总结：
 * 1，把运算符重载为一个扩展函数的形式
 */