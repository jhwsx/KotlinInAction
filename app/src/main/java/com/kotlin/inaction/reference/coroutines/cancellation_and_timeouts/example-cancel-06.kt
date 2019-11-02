package com.kotlin.inaction.reference.coroutines.cancellation_and_timeouts

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 使用 finally 来关闭资源
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    val job = launch {
        try {
            repeat(1000) {
                println("job: I'm sleeping ${it} ...")
                delay(500L)
            }
        } catch (e: Exception) {
            println("e: $e")
        } finally {
            println("job: I'm running finally")
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting")
    job.cancelAndJoin()
    println("main: Now I can quit")
}