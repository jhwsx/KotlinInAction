package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 挂起函数的并发执行
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one: Deferred<Int> = async {
            println("doSomethingUsefulOne() invoked")
            doSomethingUsefulOne()
        }
        val two: Deferred<Int> = async {
            println("doSomethingUsefulTwo() invoked")
            doSomethingUsefulTwo() }
        println("The answer is : ${one.await() + two.await()}")
    }
    println("Completed in $time ms") // 从 time 上看，比 coompose-01 里的串行方式耗时减少了一半。
}

/**
 * 总结：
 * 1，async 和 launch 的区别是什么呢？
 * async 和 launch 都是 CoroutineScope 的扩展函数。
 * async 是一个泛型函数，而 launch 不是一个泛型函数。
 * async 开启了一个单独的协程，这个协程可以和其他协程并发执行。
 * launch 会返回一个 Job 对象，但是 Job 对象不会携带任何结果值；
 * async 会返回一个 Deferred 对象，并且一定会携带结果值, 通过 deferred.await() 取出来。
 */