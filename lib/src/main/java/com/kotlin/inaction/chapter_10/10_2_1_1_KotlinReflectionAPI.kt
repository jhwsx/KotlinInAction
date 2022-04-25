package com.kotlin.inaction.chapter_10

import kotlin.reflect.*
import kotlin.reflect.full.memberProperties

/**
 *
 * @author wangzhichao
 * @since 2022/4/19
 */
fun main() {
    val person10 = Person10("Alice", 29)
    // 使用对象.javaClass，获取对应的 Java 类
    val javaClass: Class<Person10> = person10.javaClass
    // 使用 Java 类对象.kotlin 扩展属性，获取对应的 KClass 类。
    val kClass: KClass<Person10> = javaClass.kotlin
    // Kotlin 反射 API 的主要入口就是 KClass，它代表一个类。
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
    /*
    Person10
    age
    name
     */
    // KCallable 是函数和属性的超接口。它声明了 call 方法，允许调用对应的函数或者对应属性的 getter。
    val kFunction: KFunction1<Int, Unit> = ::foo
    // public fun call(vararg args: Any?): R 它的参数列表是一个可变参数列表
    kFunction.call(42) // 打印：42

    val kFunction2: KFunction2<Int, Int, Int> = ::sum
    // invoke 方法参数列表比 call 方法参数列表清晰多了。
    println(kFunction2.invoke(1, 2) + kFunction2.invoke(3, 4)) // 打印：10


    val kMutableProperty0: KMutableProperty0<Int> = ::counter
    kMutableProperty0.setter.call(21)
    println(kMutableProperty0.get()) // 打印：21

    val person = Person10("Alice", 29)
    val kProperty1: KProperty1<Person10, Int> = Person10::age
    println(kProperty1.get(person)) // 29
}

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y

var counter = 0