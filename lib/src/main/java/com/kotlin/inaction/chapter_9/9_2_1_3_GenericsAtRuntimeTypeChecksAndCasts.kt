package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/7/16
 */
fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
    printSum(setOf(3, 4, 5))
    // printSum(listOf("a", "b")) // 这里抛出类型转换异常。
}

/**
 * 总结：
 * 1，这个例子展示：对已知类型实参做类型转换，也就是说c的泛型和 List<Int> 刚好匹配，那么是可以用 is 检查的。
 */