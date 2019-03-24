package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
fun main(args: Array<String>) {
    val strings = listOf<String>("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val squares = IntArray(5) {i -> (i + 1) * (i + 1)}
    println(squares.joinToString())

    squares.forEachIndexed { index, element ->
        println("Element $index is $element")
    }
}