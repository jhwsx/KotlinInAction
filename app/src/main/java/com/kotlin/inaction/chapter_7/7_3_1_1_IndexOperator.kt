package com.kotlin.inaction.chapter_7

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

fun main(args: Array<String>) {
    val p = Point6(10, 30)
    println(p[1])
}
/**
 * 总结：
 * 1，在 kotlin 中，下标运算符是一个约定：
 * 只要定义一个名为 get 的函数，并加上 operator 关键字，那么就可以使用下标获取了。
 */