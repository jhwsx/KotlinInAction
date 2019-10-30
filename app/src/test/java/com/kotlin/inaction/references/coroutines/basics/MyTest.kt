package com.kotlin.inaction.references.coroutines.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * @author wangzhichao
 * @date 2019/10/29
 */
class MyTest {
    @Test
    fun test() = runBlocking<Unit> {
        delay(2000)
        println("Hello")
        method1()
    }

    private suspend fun method1() {
        val list = listOf<String>("Welcome", "to", "China")
        for (s in list) {
            delay(2000)
            println(s)
        }
    }
}