package com.kotlin.inaction.chapter_2

import java.util.*

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

}
/**
 * 总结：
 * 1，.. 语法不仅可以创建数字区间，还可以创建字符区间；
 * 2，可以根据键来更新和访问 map；
 * 3，迭代 map 的方法
 */
