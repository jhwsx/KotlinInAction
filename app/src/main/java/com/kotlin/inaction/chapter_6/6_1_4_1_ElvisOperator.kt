package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/27
 */
fun foo(s: String?) : String{
    val t: String = s ?: ""
    return t
}

fun main(args: Array<String>) {
    println(foo(null))
    println(foo("wzc"))
}
/**
 * 总结：
 * 1，学习 Elvis 运算符，正式的名字叫做 null 合并运算符。
 * 2，Elvis 运算符就是 ?:,它接收两个运算数，如果第一个运算数不为 null，就返回第一个运算数，
 * 如果第一个运算数为 null，就返回第二个运算数。
 * 3，自己理解：s ?: "", 是 java 中三元运算符的简写
 * s != null ? s : ""
 */