package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
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