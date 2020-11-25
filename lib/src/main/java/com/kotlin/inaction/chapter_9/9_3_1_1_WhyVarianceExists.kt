package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/12
 */
fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun main(args: Array<String>) {
    printContents(listOf("abc","bac"))
}

/**
 * 总结：
 * 1，这个例子中把 String 当成 Any 对待。是没有问题的。
 */