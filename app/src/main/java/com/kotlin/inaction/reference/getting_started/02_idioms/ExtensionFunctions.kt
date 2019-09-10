package com.kotlin.inaction.reference.getting_started.`02_idioms`

import com.kotlin.inaction.chapter_3.lastChar

/**
 * @author wangzhichao
 * @date 2019/09/10
 */
fun String.lastChar(): Char {
    return this[length-1]
}

fun main(args: Array<String>) {
    val company = "adups"
    println(company.lastChar())
}