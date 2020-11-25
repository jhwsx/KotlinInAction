package com.kotlin.inaction.reference.getting_started.`02_idioms`

/**
 * @author wangzhichao
 * @date 2019/09/10
 */
fun main(args: Array<String>) {
    var a = 1
    var b = 2
    a = b.also { b = a }
    println("a=$a,b=$b")
}