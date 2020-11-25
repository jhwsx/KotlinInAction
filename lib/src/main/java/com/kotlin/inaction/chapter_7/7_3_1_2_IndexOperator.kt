package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/9
 */
data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Unknown coordinate $index")
    }
}
fun main(args: Array<String>) {
    val p = MutablePoint(100, 200)
    p[1] = 20
    println(p)
}
/**
 * 总结：
 * 1，在 kotlin 中，下标运算符是一个约定：
 * 只要定义一个名为 set 的函数，并加上 operator 关键字，那么就可以使用下标设置值了。
 */