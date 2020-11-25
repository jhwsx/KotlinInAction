package com.kotlin.inaction.reference.coroutines._01_basics

import kotlin.concurrent.thread

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
fun main(args: Array<String>) {
    thread {
        println("thread: threadName="+ Thread.currentThread().name) // Thread-0
        Thread.sleep(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}