package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun main(args: Array<String>) {
    println(listOf(1, 2, 3).sum())
    println(listOf(1.1, 2.2, 3.3).sum())
//    listOf("a","b","c").sum()
}
/**
 * 总结：
 * 1，这里学习类型参数约束：List<Int>,List<Double>可以应用于sum(),但是List<String>不行
 */