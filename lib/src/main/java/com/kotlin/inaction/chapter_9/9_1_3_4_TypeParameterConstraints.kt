package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
// 这是一个为类型参数指定多个约束的函数
// 这个函数的作用是保证给定的 CharSequence 以句号结尾。
fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable { // 使用 where 开头声明类型参数约束的列表
    if (!seq.endsWith('.')) { // 调用了为 CharSequence 接口定义的扩展函数
        seq.append('.') // 调用了 Appendable 接口里的方法。
    }
}

fun main(args: Array<String>) {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}

/**
 * 总结：
 * 1，在一个类型参数上指定多个约束;
 * 2，若同一个类型参数需要多个上界，就需要一个单独的 where 子句。
 * 3，这里和 java 还是有区别的：
 * <T extends CharSequence&Appendable> void ensureTrailingPeriod(T seq) {
 *  if (!seq.endsWith('.')) {
 *     seq.append('.')
 *  }
 */