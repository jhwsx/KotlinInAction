package com.kotlin.inaction.reference.basics.`01_basic_types`

/**
 * @author wangzhichao
 * @date 2019/09/18
 */
fun main(args: Array<String>) {
    val arrayOf = arrayOf(0, 1, 2, 3, 4)
    println(arrayOf.joinToString())
    arrayOf[1] = 5
    println(arrayOf.joinToString())

    val arrayOfNulls = arrayOfNulls<Int>(5)
    println(arrayOfNulls.joinToString())

    val emptyArray = emptyArray<Int>()
    println(emptyArray.joinToString())
//    emptyArray[0] = 1 // java.lang.ArrayIndexOutOfBoundsException: 0
//    println(emptyArray.joinToString())

    val arr = Array(5) { it * it }
    println(arr.joinToString())

    val array: Array<Int> = arrayOf(2, 4, 6, 8)
//    val arrayAny: Array<Any> = array // 编译报错

    val intArray = IntArray(4) { it }
}