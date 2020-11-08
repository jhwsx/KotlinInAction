package com.kotlin.inaction.chapter_7

import android.opengl.Matrix

/**
 *
 * @author wzc
 * @date 2019/4/9
 */
data class Point6(val x: Int, val y: Int)

operator fun Point6.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

val array: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3, 4, 5), arrayOf(6, 7, 8, 9, 10))

operator fun Array<Array<Int>>.get(rowIndex: Int, colIndex: Int): Int {
    return this[rowIndex][colIndex]
}

fun main(args: Array<String>) {
    val p = Point6(10, 30)
    println(p[1])
    println(array[0, 4])
    println(array[1, 4])
}
/**
 * 总结：
 * 1，在 kotlin 中，下标运算符是一个约定：
 * 只要定义一个名为 get 的函数，并加上 operator 关键字，那么就可以使用下标获取了。
 */