package com.kotlin.inaction.reference.coroutines._01_basics

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

/**
 * 总结：
 * 1，delay 是一个 挂起函数（suspending function），不会阻塞线程，但会阻塞协程；它只能用在协程里面。
 */