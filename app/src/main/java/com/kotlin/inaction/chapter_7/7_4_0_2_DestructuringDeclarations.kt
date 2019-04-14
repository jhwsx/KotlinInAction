package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
class Point9(val x: Int, val y: Int){
    operator fun component1() = x

    operator fun component2() = y
}

fun main(args: Array<String>) {
    val p = Point9(10, 20)
    val (x, y) = p
    println("x=$x, y=$y")
}

/**
 * 总结：
 * 1, 非数据类，进行手动添加 componentN 方法，也可以使用解构声明。
 */