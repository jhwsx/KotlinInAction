package com.kotlin.inaction.reference.basics.`01_basic_types`

/**
 * @author wangzhichao
 * @date 2019/09/18
 */
fun main(args: Array<String>) {
    fun printDouble(d: Double) {
        println(d)
    }

    val i = 1
    val d = 1.1
    val f = 1.1f
    //printDouble(i)
    printDouble(d)
    //printDouble(f)

    printDouble(i.toDouble())
    printDouble(f.toDouble())
}