package com.kotlin.inaction.chapter_7

import java.math.BigDecimal

/**
 *
 * @author wzc
 * @date 2019/4/3
 */
operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    var bd = BigDecimal.ZERO

    println(bd++)

    println(bd)

    println(++bd)
}