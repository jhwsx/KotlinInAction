package com.kotlin.inaction.reference.coroutines._02_cancellation_and_timeouts

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/**
 * 当超时时取消协程的执行。
 * withTimeout 是以抛出异常的形式结束的。
 * @author wangzhichao
 * @date 2019/10/31
 */
fun main(args: Array<String>) = runBlocking {
    withTimeout(1300L) {
        repeat(1000) {
            println("I'm sleeping $it ...")
            delay(500L)
        }
    }
}