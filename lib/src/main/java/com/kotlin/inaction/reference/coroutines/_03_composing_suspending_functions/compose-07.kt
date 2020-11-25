package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * coroutineScope 这个层级里的协程：只要有一个抛异常，全部都会取消掉。
 * 关于这点 coroutineScope() 函数的文档说的很详细。
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis {
        try {
            failConcurrentSum()
        } catch (e: Exception) {
            println("Computation failed with ArithmeticException")
        }
    }
}

suspend fun failConcurrentSum(): Int {
    return coroutineScope {
        val one = async<Int> {
            try {
                delay(Long.MAX_VALUE)
                42
            } finally {
                println("First child was cancelled")
            }
        }
        val two = async<Int> {
            println("Second child throws an exception")
            throw ArithmeticException()
        }
        one.await() + two.await()
    }
}