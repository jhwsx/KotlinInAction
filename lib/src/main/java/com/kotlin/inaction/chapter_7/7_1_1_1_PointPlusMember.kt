package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(20, 40)
    val p2 = Point(30, 30)
    val p = p1 + p2
    println(p)
}

/**
 * 总结：
 * 1，重载二元算术运算符
 * 2，上面的 operator 是一个关键字，用于重载运算符
 * 3，调用 + 实际上是调用的 plus 函数。
 * 4，plus 这个名字不要写错了。
 */