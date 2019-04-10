package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/10
 */
data class Point7(val x: Int, val y: Int)

data class Rectangle(val upperLeft: Point7, val lowerRight: Point7)

operator fun Rectangle.contains(p: Point7): Boolean {
    val intRangeX = upperLeft.x until lowerRight.x
    println(intRangeX) // 打印 10..49
    val intRangeY = upperLeft.y until lowerRight.y
    println(intRangeY) // 打印 20..49
    return p.x in intRangeX
            && p.y in intRangeY
}

fun main(args: Array<String>) {
    val rect = Rectangle(Point7(10, 20), Point7(50, 50))
    println(Point7(20, 30) in rect)
    println(Point7(5, 5) in rect)
}

/**
 * 总结：
 * 1，使用 in 运算符检查点是否属于一个矩形的例子。
 * 2, until 函数的使用：调用的是 Ranges.kt 里的
 * public infix fun Int.until(to: Int): IntRange {
 * if (to <= Int.MIN_VALUE) return IntRange.EMPTY
 * return this .. (to - 1).toInt()
 * }
 * 可以看到只是 Int 的一个扩展函数，返回的是一个开区间。
 * 3, in 右边的对象会调用 contains 函数。在这里是 IntRange 调用它自己的 contains 函数，
 * Rectangle 调用这里定义的 contains 函数。
 */