package com.kotlin.inaction.reference.coroutines._03_composing_suspending_functions

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 延迟开始 async
 * @author wangzhichao
 * @date 2019/11/02
 */
fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) {
            println("doSomethingUsefulOne() invoked")
            doSomethingUsefulOne()
        }
        val two = async(start = CoroutineStart.LAZY) {
            println("doSomethingUsefulTwo() invoked")
            doSomethingUsefulTwo()
        }
        // 在调用 start 之后，才会执行 async。这种方式下，两个 async 仍然是并发执行。
        println("one.start()")
        one.start()
        println("two.start()")
        two.start()
        println("The answer is : ${one.await() + two.await()}")
    }
    println("Completed in $time ms")

}