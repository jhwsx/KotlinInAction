package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/10
 */
val strings = listOf("first", "second", "fourteenth")
val numbers = setOf(1, 2, 3)

fun main(args: Array<String>) {
    println(strings.first())
    println(strings.last())
    println(strings.asReversed())
    println(strings[1])
    println(strings.get(0))
    println(strings.component1())

    println(numbers.max())
}
/*
运行结果：
first
fourteenth
[fourteenth, second, first]
second
first
first
3
*/
/**
 * 总结：
 * 1，kotlin 中的集合有新的方便的 API
 * 2，其实是添加了一些扩展函数
 */
