package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 对于一个在计算任务中的协程，即便调用了 cancel 也不能停止它的计算。
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    val startTime = System.currentTimeMillis() // threadName=main
    println("1, threadName=${Thread.currentThread().name}")
    val job = launch(Dispatchers.Default) {
        println("2, threadName=${Thread.currentThread().name}") // threadName=DefaultDispatcher-worker-2
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    println("3, threadName=${Thread.currentThread().name}") // threadName=main
    delay(1300L)
    println("main: I'm tired of waiting")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}