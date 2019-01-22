package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/5
 */
enum class Colors(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 结尾要有分号

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Colors.BLUE.rgb())
}
/*
* 总结：
* 1，Kotlin 语法中唯一必须使用分号的地方：在枚举类中定义任何方法，就要使用分号把枚举常量列表和方法定义分开。
* */