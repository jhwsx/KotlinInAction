package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
infix fun Any.to(other: Any) = Pair(this, other)
// 这是库里的 to 函数，它是一个扩展函数。
//public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

infix fun Int.myuntil(to: Int): IntRange {
    if (to <= Int.MIN_VALUE) return IntRange.EMPTY
    return this .. (to - 1)
}

// 没有含义，只是为了演示中缀调用的
class Clazz {
    infix fun method(i: Int) {
        println("$this => $i")
    }
}
fun main(args: Array<String>) {
    val map1 = mapOf(1.to("one"), 3.to("three"), 5.to("five")) // 一般 to 函数的调用
    val map2 = mapOf(1 to "one", 3 to "three", 5 to "seven") // 使用中缀符号调用 to 函数
    val pair = "water".to("水")
    val(name, value) = pair // 解构声明
    println("$name=$value")

    // 解构声明用于循环
    val list = listOf<Int>(1, 2, 3)
    for ((index, elem) in list.withIndex()) {
        println("index=$index, elem=$elem")
    }

    for (i in 0 myuntil 3) {
        println("i=$i")
    }

    val clazz = Clazz()
    clazz method 1
}
/**
 * 总结：
 * 1，中缀调用：1 to "one" 中的 to 并不是内置的结构，而是一种特殊的函数调用，叫中缀调用；
 * 2，中缀调用的特点是：没有添加额外的分隔符，函数名称是直接放在目标对象名称和参数之间的；
 * 1.to("one") // 一般 to 函数的调用
 * 1 to "one" // 中缀调用
 * 3，要允许使用中缀符号调用函数，需要使用 infix 修饰符来标记它;
 * 4, 解构声明：如把一个pair用解构声明来展开
 * 5，中缀函数必须满足的条件：
 * 必须是成员函数或者扩展函数；
 * 必须有一个单一的实参；
 * 不可以接收多个形参，不可以有默认参数值。
 */