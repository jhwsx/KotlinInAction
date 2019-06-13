package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
fun <T> ensureTrailingPeriod(seq: T)
    where T:CharSequence, T: Appendable {
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
 * 1，在一个类型参数上指定多个约束
 */