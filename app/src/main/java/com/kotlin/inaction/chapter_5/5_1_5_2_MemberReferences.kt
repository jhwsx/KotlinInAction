package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/7
 */
fun salute() = println("Salute")

fun main(args: Array<String>) {
    run(::salute) // 这里省略了类名称
}

/**
 * 总结：
 * 1，成员引用不管引用的是函数还是属性，都不要在成员引用的名称后面加括号。
 * 2，成员引用引用顶层函数的例子。
 */