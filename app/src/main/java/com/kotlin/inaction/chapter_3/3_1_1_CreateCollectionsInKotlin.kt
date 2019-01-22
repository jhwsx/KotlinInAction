package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/10
 */
val set = hashSetOf(1, 7, 53) // 创建一个 HashSet
val list = arrayListOf(1,7,53) // 创建一个 ArrayList
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty_three") // 创建一个 HashMap

fun main(args: Array<String>) {
    println(set)
    println(list)
    println(map)
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}
/*
运行结果：
[1, 53, 7]
[1, 7, 53]
{1=one, 53=fifty_three, 7=seven}
class java.util.HashSet
class java.util.ArrayList
class java.util.HashMap
*/
/**
 * 总结：
 * 1，kotlin 中创建集合的方式；
 * 2，kotlin 中没有自己的集合，采用的仍是 java 中的集合
 */
