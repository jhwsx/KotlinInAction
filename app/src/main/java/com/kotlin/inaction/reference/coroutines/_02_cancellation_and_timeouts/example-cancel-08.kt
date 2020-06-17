package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * 运行一个不可取消的块
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
            //val launch = launch {
                withContext(context = NonCancellable) { // withContext 是一个挂起函数，NonCancellable 只和 withContext 配合使用
                println("job: I'm running finally")
                try {
                    delay(1000L) // 通过使用 withContext(NonCancellable) 包裹，在这里调用 delay 挂起函数不会报异常。
                } catch (e: Exception) {
                    println("e: $e")
                }
                println("job: And I've just delayed for 1 sec because I'm non-cancellable")
            }
           // println("launch: $launch")
        }
    }
    println("job:$job")
    delay(1300L)
    println("main: I'm tired of waiting")
    job.cancelAndJoin()
    println("main: I can quit")
}

/**
 * 总结：
 * 1，想一下：这里用 launch 来替换 withContext(context = NonCancelable) 为什么不行呢？
 * 因为外部的协程被取消后，内部的协程也会被取消。
 */