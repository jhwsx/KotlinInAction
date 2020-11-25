package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun evalOptimized2(e: Expr): Int = // 为什么这里必须写返回值类型呢？
        when {
            e is Num -> e.value

            e is Sum -> evalOptimized2(e.left) + evalOptimized2(e.right)

            else -> throw IllegalArgumentException("Unknown exception")
        }
//fun evalOptimized2(e: Expr): Int =
//        when(e) {
//            is Num -> e.value
//            is Sum -> evalOptimized2(e.right) + evalOptimized2(e.left)
//            else -> throw IllegalArgumentException("Unknown exception")
//        }

fun main(args: Array<String>) {
    println(evalOptimized2(Sum(Sum(Num(1),Num(2)),Num(4))))
}
/**
 * 总结：
 * 1，使用 when 来代替连串的 if 表达式
 * 2，当分支逻辑过于复杂时，可以使用代码块作为分支体
 */