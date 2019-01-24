package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/25
 */
class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client(name=$name postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client = Client("wangzhichao", 33343)
    println(client)
}
