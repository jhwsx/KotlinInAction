package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/13
 */
fun testInvariant1(list: MutableList<String>) {}
fun testInvariant2(list: MutableList<Int>) {}
fun main(args: Array<String>) {
    val list1: MutableList<String> = mutableListOf<String>()
    val list2: MutableList<Int> = mutableListOf<Int>()

//    testInvariant1(list2) // 编译不通过，说明 MutableList<Int> 不是 MutableList<String> 的子类型

//    testInvariant2(list1) // 编译不通过，说明 MutableList<String> 不是 MutableList<Int> 的子类型
}

/**
 * 总结：
 * 1，这个例子学习不变型的术语：
 * 一个泛型类--例如 MutableList，如果对于任意两种类型 A 和 B, MutableList<A> 既不是 MutableList<B>
 * 的子类型也不是它的超类型，那么就说这个泛型类在该类型参数上是不变型的。
 * 2, Java 中所有的类都是不变型的.
 */