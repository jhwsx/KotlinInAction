package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun getMnemonic(color: Color) =
    when (color) { // 这是一个多行的表达式体函数，仍然是一个表达式体
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.VIOLET))
}

/*
* 总结：
* 1，when 是一个有返回值的表达式，是 java 的 switch 的替代品；
* 2，when 中没有 break 了，避免了漏写 break。
*/