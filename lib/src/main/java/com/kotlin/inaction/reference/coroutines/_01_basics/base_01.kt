package com.kotlin.inaction.reference.coroutines._01_basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
fun main(args: Array<String>) {
    println("start:${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // threadName=main
    val launch = GlobalScope.launch {
        // launch a new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!,${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // print after delay threadName=DefaultDispatcher-worker-2
    }
//    launch.cancel()
    println("launch: $launch")
    println("Hello, ${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
    println("end:${System.currentTimeMillis()}, threadName=${Thread.currentThread().name}") // main
}
/**
start:1573700138222, threadName=main
launch: StandaloneCoroutine{Active}@4b85612c
Hello, 1573700138311, threadName=main
World!,1573700139340, threadName=DefaultDispatcher-worker-1
end:1573700140311, threadName=main
 */