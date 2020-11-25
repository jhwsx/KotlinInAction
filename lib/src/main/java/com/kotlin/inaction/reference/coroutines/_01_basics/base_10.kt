package com.kotlin.inaction.reference.coroutines._01_basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 接着看一下 base_12
 * @author wangzhichao
 * @date 2019/10/30
 */
fun main(args: Array<String>) = runBlocking {
    println("1, threadName=${Thread.currentThread().name}") // threadName=main
    launch {
        println("2, threadName=${Thread.currentThread().name}") // threadName=main
        doWorld()
    }
    println("Hello,")
}
// 这是一个挂起函数
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

/**
 * 总结：
 * 1，普通函数和挂起函数的区别？
 * 它们都可以用在协程里面；
 * 但是挂起函数可以调用其他挂起函数，而普通函数是不可以调用挂起函数的。
 */