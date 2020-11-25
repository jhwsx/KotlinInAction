package com.kotlin.inaction.reference.coroutines._01_basics

import kotlin.concurrent.thread

/**
 * @author wangzhichao
 * @date 2019/10/30
 */
//fun main(args: Array<String>) = runBlocking {
//    repeat(100_000) {
//        launch {
//            delay(1000L)
//            print(".")
//        }
//    }
//}

fun main(args: Array<String>) {
    for (i in 0..100_1000) {
        thread {
            Thread.sleep(2000L)
            println(".")
        }
    }
}

/**
 * 总结：
 * 1，协程是轻量的。
 * TODO 这个没验证出来。
 */