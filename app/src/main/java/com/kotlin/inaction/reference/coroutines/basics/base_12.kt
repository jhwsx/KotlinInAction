package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 与 base_10 一起看
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking {
    println("1, threadName=${Thread.currentThread().name}") // threadName=main
    doWork()
    println("Hello,")
}
// 提取的函数包含 coroutine builder，这时候就不需要 suspend 关键字
private fun CoroutineScope.doWork() { // 这是一个 CoroutineScope 的扩展函数
    launch {
        println("2, threadName=${Thread.currentThread().name}") // threadName=main
        delay(1000L)
        println("World!")
    }
}