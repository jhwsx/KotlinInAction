package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 在一个关闭的协程的 finally 块中再去调用挂起函数会抛出异常的
 * 这里以调用 delay 挂起函数为例，从 delay 函数的文档中也有说明的。
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    val job = launch {
        try {
            repeat(1000) {
                println("job: I'm sleeping $it ...")
                delay(500L)
            }
        } finally {
            try {
                delay(30000L)
            } catch (e: Exception) {
                println("exception: $e")
            }
            println("job: I'm running finally")
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting")
    job.cancelAndJoin()
    println("main: I can quit")
}

/*
运行结果：
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting
exception: kotlinx.coroutines.JobCancellationException: Job was cancelled; job=StandaloneCoroutine{Cancelling}@4e515669
job: I'm running finally
main: I can quit
*/