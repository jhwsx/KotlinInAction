package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 演示取消一个在计算任务中的协程，通过 CoroutineScope 的扩展属性 isActive
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(context = Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if (!isActive) {
                return@launch
            }
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting")
    job.cancelAndJoin()
    println("main: Now I can quit")

}