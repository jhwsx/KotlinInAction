package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value // 代码块中的最后一个表达式就是结果
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)),Num(4))))
}
/**
 * 总结：
 * 1，代码块作为 if 和 when 的分支体时，代码块中的最后一个表达式就是结果
 */
