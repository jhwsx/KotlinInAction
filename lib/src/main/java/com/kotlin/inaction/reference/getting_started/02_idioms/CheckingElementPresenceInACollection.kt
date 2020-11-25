package com.kotlin.inaction.reference.getting_started.`02_idioms`

/**
 * @author wangzhichao
 * @date 2019/09/10
 */
fun main(args: Array<String>) {
    val list = listOf<String>("adups", "abup")
    if ("apple" in list) {
        println("yes")
    } else {
        println("no")
    }
}