package com.kotlin.inaction.reference.coroutines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author wangzhichao
 * @date 2019/10/29
 */
fun main(args: Array<String>) = runBlocking<Unit> {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // 这行代码的含义是挂起当前的协程，直到指定的 job 完成为止。
}

/**
 * 总结：
 * 1，之前的例子都是使用阻塞的方法来等待另一个正在工作的协程，这不是好的办法；
 * 2，这里采用等待（一种非阻塞的方式），直到后台的协程完成为止。
 */