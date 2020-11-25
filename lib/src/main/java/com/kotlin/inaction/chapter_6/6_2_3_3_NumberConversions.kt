package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/14
 */
fun main(args: Array<String>) {
    val b: Byte = 1 // 使用数字字面值去初始化一个类型已知的变量时, 1 转换为了 Byte 类型
    val l = b + 1L
    foo(l) // 把字面值作为实参传递给函数

    foo(42)

}

fun foo(l: Long) {
    println(l)
}

/**
 * 总结：
 * 1，自动转换发生的情况:
 * 使用数字字面值去初始化一个类型已知的变量时，
 * 把字面值作为实参传递给函数时。
 * 2, + 可以进行字节类型和长整型参数的计算
 *
 */