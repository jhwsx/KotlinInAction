package com.kotlin.inaction.reference.functions_and_lambdas.lambdas

/**
 * <pre>
 *     author : wangzhichao
 *     e-mail : wangzhichao@adups.com
 *     time   : 2019/08/20
 *     desc   :
 *     version: 1.0
 * </pre>
 */
fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4, 5)
    items.fold(0, {acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        result
    })
    val joinedToString = items.fold("Elements:", { acc: String, i: Int -> acc + " " + i })
    println("joinedToString = $joinedToString")

    val product = items.fold(1, Int::times)
    println("product = $product")
}