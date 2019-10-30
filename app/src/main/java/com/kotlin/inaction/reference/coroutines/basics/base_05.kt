package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @author wzc
 * @date 2019/10/27
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    // start main coroutine
    println("runBlocking: threadName=${Thread.currentThread().name}")
    GlobalScope.launch {
        // launch a new coroutine in background and continue
        println("GlobalScope.launch: threadName=${Thread.currentThread().name}")
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main coroutine continues here immediately
    delay(2000L)      // delaying for 2 seconds to keep JVM alive
}
/*
runBlocking: threadName=main // 注意这里是主线程，而不是其他线程
Hello,
GlobalScope.launch: threadName=DefaultDispatcher-worker-1
World!
*/

/**
 * 总结：
 * 1，使用 runBlocking 包裹了主函数的代码，与 FirstCoroutines5 是功能一样的。
 * 2，runBlocking<Unit>, 作为一个适配器，开启了顶层的主协程。这里指定 Unit 是作为它的返回值，因为
 * 在 Kotlin 中一个好的 main 方法需要返回一个 Unit。
 */