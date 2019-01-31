package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))
}