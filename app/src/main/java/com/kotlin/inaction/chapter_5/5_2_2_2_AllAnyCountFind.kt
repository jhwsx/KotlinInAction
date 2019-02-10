package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 }) // 不是所有的元素都等于 2 的意思，not all
    println(list.any { it != 3 }) // 至少有一个元素不等于 3
}
/**
 * 总结：
 */