package com.kotlin.inaction.reference.classes_and_objects.`15_delegation_properties`

/**
 * 标准委托-Lazy
 * @author wangzhichao
 * @date 2019/09/08
 */
val lazyValue: String by lazy {
    println("computed")
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}

/**
 * 总结：
 * 1，lazy() 是一个函数，它接收一个 lambda（() -> T），返回的是 Lazy<T> 的实例。这个实例就是委托对象；
 * 2，默认的 lazy() 是同步的。
 */
