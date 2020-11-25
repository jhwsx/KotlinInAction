package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
operator fun Point.times(scale: Double):Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(point: Point): Point {
    return Point((this * point.x).toInt(), (this * point.y).toInt())
}
fun main(args: Array<String>) {
    val p = Point(10, 20)
    val p2 = p * 1.5
    println(p2)

    val p3 = 2.5 * p
    println(p3)
}

/**
 * 总结：
 * 1，定义一个运算数类型不同的运算符
 * 2，需要注意的是，Kotlin 的运算符不会自动支持交换性。
 */