package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 挂起函数是依次调用的
 *
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis { // measureTimeMillis() 是 kotlin 标准库中的一个方法，跟协程没得关系。
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    return 29
}