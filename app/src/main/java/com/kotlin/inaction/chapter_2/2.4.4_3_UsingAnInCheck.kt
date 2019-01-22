package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun main(args: Array<String>) {
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Swift"))
}
/**
 * 总结：
 * 1，区间不仅限于字符；
 * 2，区间适用于有一个支持实例比较操作的任意类（实现了 java.lang.Comparable 接口）
 * 3，in 检查也适用于集合
 */
