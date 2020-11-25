package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/14
 */
fun main(args: Array<String>) {
    val i = 1
//    val l: Long = i // 此行编译错误
//    Type mismatch.
//    Required:
//    Long
//    Found:
//    Int
    val ll: Long = i.toLong() // 必须显式地进行转换
}

/**
 * 总结：
 * 1，学习 kotlin 和 java 中处理数字转换的方式
 * 2，kotlin 中不会自动地把数字从一种类型转换成另一种类型，即便是转换成范围更大的类型。
 * java 中是存在自动类型提升的。
 */