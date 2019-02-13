package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/13
 */
fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).asSequence()
        .map {
            print("map $it ")
            it * it
        }
        .filter {
            print("filter($it) ")
            it % 2 == 0
        }
        .toList())
}

/**
 * 总结：
 * 1，执行序列操作的执行顺序：所有操作按顺序应用在每一个元素上，处理完第一个元素，然后在处理第二个元素。
 */