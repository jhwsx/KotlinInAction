package com.kotlin.inaction.reference.basics.`01_basic_types`

/**
 * @author wangzhichao
 * @date 2019/09/18
 */
fun main(args: Array<String>) {
    val f1 = 3.14f
    val f2 = 3.14f
    println("f1 == f2: ${f1 == f2}")

    val range = 0.1f..1.0f
    val f = 0.5f
    println("f in range: ${f in range}")

    val char: Char = 1.toChar()
   // if (char == 1) { // 编译报错，Char 不能认为是 Number
//
    //}

    // 把 Char 转成 Int
    for (ch in '0'..'9') {
        println(ch.toInt() - '0'.toInt())
    }
}