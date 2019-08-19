package com.kotlin.inaction.chapter_5

/**
 * <pre>
 *     author : wangzhichao
 *     e-mail : wangzhichao@adups.com
 *     time   : 2019/08/18
 *     desc   :
 *     version: 1.0
 * </pre>
 */
fun main(args: Array<String>) {
    val hello = "Hello, World!"

    // this
    hello.run { println("The receiver string's length is $length") }
    // 这行与上面是等效的
    hello.run {  println("The receiver string's length is ${this.length}") }
    // it
    hello.let { println("The receiver string's length is ${it.length}") }
}