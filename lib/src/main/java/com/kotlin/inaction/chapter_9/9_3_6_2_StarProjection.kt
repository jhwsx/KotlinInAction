package com.kotlin.inaction.chapter_9


/**
 *
 * @author wangzhichao
 * @since 2022/4/18
 */
fun main() {
    // 只是读取数据而不关心它的具体类型，所以使用星号投影的语法。
    fun printFirst(list: List<*>) {
        if (list.isNotEmpty()) {
            println(list.first())
        }
    }

    printFirst(listOf("abup", "adups"))

    // 使用泛型函数
    fun <T> printFirst2(list: List<T>) {
        if (list.isNotEmpty()) {
            println(list.first())
        }
    }

    printFirst2(listOf("adups", "abup"))
}