package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
fun main(args: Array<String>) {
    for (i in args.indices) {
        println("Argument $i is : ${args[i]}")
    }

    val arrayOf = arrayOf(1, 2, 3)
    for (i in arrayOf) {
        println(i)
    }

    val arrayOfNulls = arrayOfNulls<Int?>(1)
    arrayOfNulls[0] = null
    arrayOfNulls[0] = 1

    val letters = Array<String>(26) { i ->
        ('a' + i).toString()
    }
    println(letters.joinToString(""))
}
/**
 * 1, Kotlin 中的数组是一个带有类型参数的类
 */