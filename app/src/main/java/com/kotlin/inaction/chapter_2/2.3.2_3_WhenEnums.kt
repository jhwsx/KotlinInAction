package com.kotlin.inaction.chapter_2

import com.kotlin.inaction.chapter_2.Color.* // 显式地导入枚举类常量，可以直接使用颜色的名称了

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun getWarmth2(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth2(GREEN))
}