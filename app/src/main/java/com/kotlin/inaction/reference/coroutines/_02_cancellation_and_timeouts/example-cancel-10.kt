package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/**
 * 当超时时取消协程的执行。
 * withTimeoutOrNull 是以返回 null，而非抛出异常。
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    //println("1, threadName=${Thread.currentThread().name}") // main
    val result = withTimeoutOrNull(1300L) {
        //println("2, threadName=${Thread.currentThread().name}") // main
        repeat(1000) {
            println("I'm sleeping $it ...")
            delay(500L)
        }
        "Done"
    }
    //println("3, threadName=${Thread.currentThread().name}") // main
    println("Result is $result")
}