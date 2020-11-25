package com.kotlin.inaction.chapter_8

import java.util.concurrent.locks.Lock

/**
 *
 * @author wzc
 * @date 2019/6/3
 */
fun foo(l: Lock) {
    println("Befor sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}

/**
 * 总结：
 * 1，这个例子中 synchronized 函数的实现 和 lambda 表达式都会被内联;
 * 2, lambda 生成的字节码会成为函数调用者的一部分，而不是被包含在一个实现了函数接口的匿名内部类中。
 */
