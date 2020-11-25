package com.kotlin.inaction.reference.basics.returns_and_jumps

/**
 * @author wangzhichao
 * @date 2019/09/19
 */
fun main(args: Array<String>) {
    println("break:")
    loop@ for (i in 1..10) {
        for (j in 'a'..'g') {
            if (j == 'f') {
                break@loop // 终止外层循环
            }
            println("i = $i, j = $j")
        }
    }
    println("continue:")
    loop@ for (i in 1..10) {
        for (j in 'a'..'g') {
            if (j == 'd') {
                continue@loop
            }
            println("i = $i, j = $j")
        }
    }
}