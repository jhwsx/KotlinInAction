package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
fun main(args: Array<String>) {
    println("start:${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}")
    GlobalScope.launch { // launch a new coroutine in background and continue
        Thread.sleep(1000L)
        println("World!,${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // print after delay
    }
    println("Hello, ${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
    println("end:${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}")
}