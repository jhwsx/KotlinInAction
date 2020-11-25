package com.kotlin.inaction.reference.basics.returns_and_jumps

/**
 * @author wangzhichao
 * @date 2019/09/19
 */
fun main(args: Array<String>) {
    val str: String? = null
    val s = str ?: fail()

    val ss = str ?: return // Nothing type
}

private fun fail(): Nothing {
    throw IllegalArgumentException("unknown value")
}