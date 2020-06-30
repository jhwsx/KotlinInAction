package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
sealed class Expr2
class Num1(val value: Int) : Expr2()
class Sum1(val left: Expr2, val right: Expr2) : Expr2()
fun eval2(e: Expr2): Int =
    when (e) {
        is Num1 -> e.value
        is Sum1 -> eval2(e.right) + eval2(e.left)
    }

fun main(args: Array<String>) {
    println(eval2(Sum1(Num1(1), Num1(2))))
}