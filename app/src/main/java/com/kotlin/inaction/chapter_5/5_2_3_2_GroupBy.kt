package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}

/**
 * 总结：
 * first 不是 String 类的成员，而是一个扩展。这里是把 first 当做成员引用访问。
 */