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
        // 通过 await 也可以开始 async，但是这里两个 async 就成了 串行执行。
        // 一个 await 取到结果后，才会继续下一个 async.
        println("The answer is : ${one.await() + two.await()}")
    }
    println("Completed in $time ms")

}

/**
 * 总结：
 * 1，async(start = CoroutineStart.LAZY) 替代了标准库中的 lazy 函数，用于
 * 挂起函数中的计算。
 */