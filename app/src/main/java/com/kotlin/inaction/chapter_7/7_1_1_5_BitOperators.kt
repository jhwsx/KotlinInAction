package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/28
 */
fun main(args: Array<String>) {
    println(0x0F and 0xF0) // 按位与中缀调用

    println(0x0F.and(0xF0)) // 按位与函数，等价于中缀调用

    println(0x0F or 0xF0) // 按位或中缀调用

    println(0xFF xor 0x0F) // 按位异或中缀调用

    println(0xFF.inv()) // 按位取反函数，它没有中缀调用，其它的都有

    println(1 shl 7) // 带符号左移中缀调用

    println(128 shr 7) // 带符号右移中缀调用

    println(128 ushr 8) // 无符号右移中缀调用
}