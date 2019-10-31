package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
fun main(args: Array<String>) {
    GlobalScope.launch {
        println("1, threadName=${Thread.currentThread().name}") // threadName=DefaultDispatcher-worker-1
        // launch a new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("2, threadName=${Thread.currentThread().name}") // main
    println("Hello,") // main thread continues while coroutine is delayed
    runBlocking { // runBlocking 块是线程阻塞，阻塞了主线程；在该块完成之前，都会阻塞主线程。
        // but this expression blocks the main thread
        println("3, threadName=${Thread.currentThread().name}") // main
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}

/**
 * 总结：
 * 1，runBlocking 是线程阻塞的；
 * 2，GlobalScope.launch 不会阻塞线程;
 * 3, Thread.sleep() 是线程阻塞的。
 */
