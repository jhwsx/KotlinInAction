package com.kotlin.inaction.reference.basics.`01_basic_types`

/**
 * @author wangzhichao
 * @date 2019/09/18
 */
fun main(args: Array<String>) {
    val byte: Byte = -128
    val short: Short = -32768
    val int: Int = -999999999
    val long: Long = 999999999999999999L
    println("byte: $byte, short: $short, int: $int, long: $long")

    val pi = 3.14
    val e = 2.7182818284
    val eFloat = 2.7182818284f
    println(pi)
    println(e)
    println(eFloat)
}