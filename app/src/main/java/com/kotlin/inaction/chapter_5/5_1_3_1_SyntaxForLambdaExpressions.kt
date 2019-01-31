package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {

    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val print = {x: Int -> println(x)}

    print(33)
}

/**
 * 总结：
 * 1，学习 lambda 表达式的语法：
 * 一个 lambda 把一小段行为进行编码，可以把它当作值到处传递；
 * 可以把它独立地声明并储存到一个变量中；
 * 常见的是直接声明它并传递给函数。
 *
 * { x: Int, y: Int -> x + y }
 * kotlin 中的 lambda 表达式始终用花括号包围着；
 * 箭头左边的是实参；
 * 箭头右边的是 lambda 的函数体。
 */