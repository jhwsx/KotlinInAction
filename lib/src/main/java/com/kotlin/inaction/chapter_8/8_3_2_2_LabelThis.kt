package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    // 带接收者的 lambda —— 包含一个隐式上下文对象的 lambda 可以通过一个 this 引用去访问。
    // 给带接收者的 lambda 指定标签，就可以通过对应的带有标签的 this 表达式访问它的隐式接收者。
    println(StringBuilder().apply sb@ {
        listOf(1, 2, 3).apply {
            // 单个 this 指向作用域内最近的隐式接收者，这里就是 List<Int>
            // this@sb 使用了显式的标签访问外层的接收者。
            this@sb.append(this.toString())
        }
    })
}