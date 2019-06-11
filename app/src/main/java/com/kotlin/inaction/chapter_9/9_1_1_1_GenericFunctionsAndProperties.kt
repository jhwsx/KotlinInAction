package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2)) // 显式地指定类型实参
    println(letters.slice(10..13)) // 不指定类型实参，而由编译器推导出来
}
/**
 * 总结：
 * 1，复习一下 .. 语法：.. 运算符是调用 rangeTo 函数的一个简洁方法，返回的对象实现了 kotlin.collections.Iterable<kotlin.Char> 接口，
 * 所以可以调用 public fun <T> kotlin.collections.Iterable<T>.toList(): kotlin.collections.List<T> { /* compiled code */ }
 * 2，另外使用 .. 语法要把它括起来，这个运算符的优先级低于算术运算符。
 * 3，学习类型形参声明，以及如何使用类型形参。
 */