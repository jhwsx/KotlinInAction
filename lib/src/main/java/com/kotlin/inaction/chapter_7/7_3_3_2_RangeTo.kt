package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/11
 */
fun main(args: Array<String>) {
    val n = 9
    println(0..n + 1) // 这是正确的写法
    println(0..(n + 1)) // 这是更清晰的写法

//    0..n.forEach // 不被编译了
    (0..n).forEach { print(it) }
}
/**
 * 总结：
 * 1，rangeTo 运算符的优先级低于算术运算符；
 */