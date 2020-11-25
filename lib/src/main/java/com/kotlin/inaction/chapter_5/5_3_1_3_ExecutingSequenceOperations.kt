package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/14
 */
fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).asSequence()
        .map {
            print("map($it) ")
            it * it
        }
        .find {
            print("find($it) ")
            it > 3
        })
}

/**
 * 总结：
 * 1, 部分元素根本不会发生任何变换
 */