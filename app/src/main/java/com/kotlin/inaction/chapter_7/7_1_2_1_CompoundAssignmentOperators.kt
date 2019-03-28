package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/28
 */
data class Point3(val x: Int, val y: Int) {
    operator fun plus(p: Point3): Point3 {
        return Point3(x+p.x,y+p.y)
    }
}


fun main(args: Array<String>) {
    var point = Point3(1, 2)
    point += Point3(2, 3)
    println(message = point)
}

/**
 * 总结：
 * 1，重载复合赋值运算符的学习。
 */