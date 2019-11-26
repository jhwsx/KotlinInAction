package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
fun main(args: Array<String>) {
    val icompanies = listOf("adups", "abup")
    val firms = mutableListOf("adups", "abup", "apple", "alphabet", "amazon")
    val filter = firms.filter<String> { it !in icompanies }
    println(filter)
}
/**
 * 总结：
 * 1, 调用泛化的高阶函数
 */