package com.kotlin.inaction.chapter_8

import java.util.concurrent.locks.Lock
import kotlin.concurrent.withLock

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {

}

fun boo(l: Lock) {
    println("Before lock")
    // withLock 是 Lock 接口的扩展函数，它也是一个内联函数。666
    l.withLock {
        println("Action")
    }
    println("After lock")
}