package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/28
 */
fun main(args: Array<String>) {
    // 用于可变集合
    val numbers = ArrayList<Int>()
    println("numbers=$numbers, numbers.hashCode=${numbers.hashCode()}")
    numbers += 42 // <===> numbers.add(42)
    numbers += 43
    println("numbers=$numbers, numbers.hashCode=${numbers.hashCode()}")
}

/**
 * 总结：
 * 1, += 运算可以修改使用它的变量所引用的对象，但不会重新分配引用。
 * 2，将一个元素添加到可变集合，+= 在这里实际上是 plusAssign 函数，继而 add 函数的调用。
 */