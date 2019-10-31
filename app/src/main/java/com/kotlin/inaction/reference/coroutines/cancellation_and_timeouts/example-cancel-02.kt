package com.kotlin.inaction.reference.coroutines.cancellation_and_timeouts

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 取消协程执行例子
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    println("1, threadName=${Thread.currentThread().name}") // main
    val job = launch {
        println("2, threadName=${Thread.currentThread().name}") // main
        repeat(1000) {
            println("3, threadName=${Thread.currentThread().name}") // main
            println("job: I'm sleeping $it ...")
            delay(500L)
        }
    }
    println("4, threadName=${Thread.currentThread().name}") // main
    delay(1300L)
    println("5, threadName=${Thread.currentThread().name}") // main
    println("main: I'm tired of waiting!")
//    job.cancel() // cancel 调用后，就不会再有 3 输出了。
//    job.join()
    // 下边这行等效于上面的两行
    job.cancelAndJoin()
    println("main: Now I can quit.")

}