package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/10
 */
fun main(args: Array<String>) {
    val mutableList = mutableListOf<Int>(1, 2, 3)
    mutableList[0] = 5
    println(mutableList)

    val listOf = listOf<Int>(2, 4, 6)
//    listOf[0] = 8 // 此行报错，因为这是只读集合
    println(listOf[0])

    val mutableMap = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    println(mutableMap[2])
}