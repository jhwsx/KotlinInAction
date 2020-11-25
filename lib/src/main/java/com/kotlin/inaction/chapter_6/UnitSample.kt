package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/17
 */
open class UnitSample {
    open fun f() {
        println("UnitSample f()")
    }

    open fun g(): Unit {
        println("UnitSample g()")
    }
}