package com.kotlin.inaction.chapter_7

import java.math.BigDecimal

/**
 *
 * @author wzc
 * @date 2020/11/01
 */
operator fun BigDecimal.dec() = this - BigDecimal.ONE

fun main(args: Array<String>) {
    var bd = BigDecimal.TEN

    println(bd--)

    println(--bd)

    println(bd)
}