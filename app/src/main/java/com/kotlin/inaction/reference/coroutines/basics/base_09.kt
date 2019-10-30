package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author wangzhichao
 * @date 2019/10/30
 */
fun main(args: Array<String>) = runBlocking {
    launch {
        println("launch 1 coroutine, threadName=${Thread.currentThread().name}")
        delay(200L)
        println("Task from runBlocking")
    }
    coroutineScope {
        println("coroutineScope coroutine, threadName=${Thread.currentThread().name}")
        launch {
            println("launch 2 coroutine, threadName=${Thread.currentThread().name}")
            delay(500L)
            println("Task from nested launch")
        }
        delay(100L)
        println("Task from coroutine scope")
    }
    println("Coroutine scope is over")
}

/*
Task from coroutine scope
Task from runBlocking
Task from nested launch
Coroutine scope is over
*/

/**
 * 总结：
 * 1，runBlocking 和 coroutineScope 的区别是什么？
 * runBlocking 是会阻塞当前线程，coroutineScope 不会阻塞当前线程；
 * 相同点是它们都会等待它的 scope 里包含的协程去完成。
 */