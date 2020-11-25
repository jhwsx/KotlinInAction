package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.VIOLET))
}
/*
* 总结：
* 1， when 表达式把多个值合并到一个分支，只需要用逗号隔开这些值，跟 java 的 switch 穿透一样*/