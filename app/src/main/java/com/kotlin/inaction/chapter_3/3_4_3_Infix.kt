package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
infix fun Any.to(other: Any) = Pair(this, other)
// 这是库里的 to 函数，它是一个扩展函数。
//public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

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
}
/**
 * 总结：
 * 1，中缀调用：1 to "one" 中的 to 并不是内置的结构，而是一种特殊的函数调用，叫中缀调用；
 * 2，中缀调用的特点是：没有添加额外的分隔符，函数名称是直接放在目标对象名称和参数之间的；
 * 1.to("one") // 一般 to 函数的调用
 * 1 to "one" // 中缀调用
 * 3，要允许使用中缀符号调用函数，需要使用 infix 修饰符来标记它;
 * 4, 解构声明：如把一个pair用解构声明来展开
 */