package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 异步风格的函数
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) {
    val time = measureTimeMillis {
        val one = somethingUsefulOneAsync()
        val two = somethingUsefulTwoAsync()
        runBlocking { // 开启一个协程，阻塞主线程，等待代码块完成。
            println("The answer is ${one.await() + two.await()}") // await 是一个挂起函数，挂起函数要么在另外一个挂起函数里调用，要么在一个协程里调用
        }
    }
    println("Completed in $time ms")
}

fun somethingUsefulOneAsync() : Deferred<Int>{
    return GlobalScope.async {
        println("1, threadName=${Thread.currentThread().name}")
        doSomethingUsefulOne()
    }
}

fun somethingUsefulTwoAsync(): Deferred<Int> {
    return GlobalScope.async {
        println("2, threadName=${Thread.currentThread().name}")
        doSomethingUsefulTwo()
    }
}

/**
 * 总结：
 * 1，文档上不推荐使用这种方式来写。
 */

