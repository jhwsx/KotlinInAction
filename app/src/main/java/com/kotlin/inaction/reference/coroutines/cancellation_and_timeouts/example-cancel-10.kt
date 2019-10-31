package com.kotlin.inaction.reference.coroutines.cancellation_and_timeouts

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/**
 * 当超时时取消协程的执行。
 * withTimeoutOrNull 是以返回 null，而非抛出异常。
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) {
            println("I'm sleeping $it ...")
            delay(500L)
        }
        "Done"
    }
    println("Result is $result")
}