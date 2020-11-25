package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun processNotNullString(str: String) {}
fun main(args: Array<String>) {
    val str: String? = "hello"
    val length = str?.let {
        println("let() called on $it")
        it.length
    }
}
