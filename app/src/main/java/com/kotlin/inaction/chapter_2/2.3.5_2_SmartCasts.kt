package com.kotlin.inaction.chapter_2

import java.lang.IllegalArgumentException

/**
 *
 * @author wangzhichao
 * @since 2020/6/19
 */
interface Expr2
class Num2(val value: Int): Expr2
class Product(val left: Expr2, val right: Expr2) : Expr2

fun eval2(e: Expr2): Int {
    if (e is Num2) {
        val n = e as Num2
        return n.value
    }
    if (e is Product) {
        return eval2(e.left) * eval2(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}


fun main(args: Array<String>) {
    println(eval2(Product(Product(Num2(1), Num2(2)), Num2(4))))

    var p: Num2 = Num2(1)
    println(eval2(p))

    var x = 1
    a(x)

    var s = "a"
    a(s)
}

fun a(x: Any) {
    if (x is String) {
        println(x.length)
    }
}