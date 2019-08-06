package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}
fun main(args: Array<String>) {
    println(oneHalf(3))
    println(oneHalf(3000L))
    println(oneHalf(3.14f))
}

/**
 * 总结：
 * 1，定义类型参数约束：上面的例子中 T 是类型参数，后面跟冒号（:）,再跟着 Number，这是类型参数上界的类型。
 */