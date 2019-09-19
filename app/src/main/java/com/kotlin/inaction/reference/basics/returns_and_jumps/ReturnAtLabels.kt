package com.kotlin.inaction.reference.basics.returns_and_jumps

/**
 * @author wangzhichao
 * @date 2019/09/19
 */
fun main(args: Array<String>) {
    foo1()
    println()
    foo2()
    println()
    foo3()
    println()
    foo4()
}

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // 非本地的 return 会直接终止 foo1()
        print(it)
    }
    println("this point is unreachable")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // 终止的只是 lambda
        print(it)
    }
    println(" done with explicit label")
}
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print(it)
    }
    println(" done with implicit label")
}
fun foo4() {
    listOf(1,2,3,4,5).forEach(fun(value: Int) {
        if (value == 3) return // 终止的是匿名函数
        print(value)
    })
    println(" done with anonymous function")
}