package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Structured concurrency with async
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")
}

suspend fun concurrentSum(): Int {
    return coroutineScope { // 这是一个挂起函数，并且它是一个顶层函数
        println("1, threadName=${Thread.currentThread().name}")
        val one = async { doSomethingUsefulOne() } // async 是一个挂起函数，但它是一个 CoroutineScope 的扩展函数
        val two = async { doSomethingUsefulTwo() }
        one.await() + two.await()
    }
}

/**
 * 总结：
 * 1，考虑一下：在 concurrentSum 中，concurrentSum 已经是一个挂起函数了，async 为什么不直接在 concurrentSum 里调用，
 * 却要包在 coroutineScope 里面呢？
 * coroutineScope() 函数的作用是创建一个 CoroutineScope 对象并且用这个对象调用指定的挂起代码。
 * 而 async 是 CoroutineScope 的扩展函数，调用它需要一个 CoroutineScope 对象的存在。
 */

