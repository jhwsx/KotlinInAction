package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
       "The first element is ${first()},"+
               " the last element is ${last()}"
    }
    println(firstAndLast)
}

/**
 * 总结：
 * 1，使用 with 函数，并且使用它的 lambda 结果
 */