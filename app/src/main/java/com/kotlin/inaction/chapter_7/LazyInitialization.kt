package com.kotlin.inaction.chapter_7

/**
 * 参考：https://blog.csdn.net/dpl12/article/details/80758049
 * @author wangzhichao
 * @date 2020/11/13
 */
class LazyInitialization {
    private val name: Int by lazy { 1 }

    fun printName() {
        println(name)
    }
}