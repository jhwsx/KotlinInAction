package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

/**
 * @author wangzhichao
 * @date 2019/10/26
 */
fun main(args: Array<String>) {
    thread {
//        delay(1000L) // 编译报错：Suspend function 'delay' should be called only from a coroutine or another suspend function
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}