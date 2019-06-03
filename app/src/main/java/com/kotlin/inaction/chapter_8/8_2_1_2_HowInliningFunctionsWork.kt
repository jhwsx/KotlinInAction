package com.kotlin.inaction.chapter_8

import java.util.concurrent.locks.Lock

/**
 *
 * @author wzc
 * @date 2019/6/3
 */
class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}

/**
 * 总结：
 * 1，这个例子调用了 synchronized 函数这个内联函数，但是传递了函数类型的变量作为参数；
 * 2，这时，lambda 的代码在内联函数被调用点是不可用的，因此不会被内联。
 */
