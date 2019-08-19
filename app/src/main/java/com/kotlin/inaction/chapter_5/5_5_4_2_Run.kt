package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+1234 -FFFF no-a-number")) {
        println(match.value)
    }
}

/**
 * 总结：
 * run 函数不是扩展函数的例子，返回值还是 lambda 结果，但不用获取上下文对象了。
 */
