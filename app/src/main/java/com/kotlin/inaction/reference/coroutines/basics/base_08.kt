package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author wangzhichao
 * @date 2019/10/30
 */
fun main(args: Array<String>) = runBlocking {
    println(this)
    println(coroutineContext) // 这里可以打印出 coroutineContext，而 coroutineContext 正是 CoroutineScope 接口的一个属性。
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}

/**
 * 总结：
 * 1，Every coroutine builder, including runBlocking, adds an instance of CoroutineScope to the scope of its code block.
 * 2，这里我们没有使用 base_07 里的最后一句 job.join(),仍然是正确的，原因是：
 * 外部的协程不会完成直到在它的 scope 里 launch 的所有协程都完成为止。
 */