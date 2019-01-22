package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun evalOptimizedIf(e: Expr) =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.left) + eval(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(evalOptimizedIf(Sum(Sum(Num(1),Num(2)),Num(4))))
}
/**
 * 总结：
 * 1，if 是个表达式，具有返回值
 */
