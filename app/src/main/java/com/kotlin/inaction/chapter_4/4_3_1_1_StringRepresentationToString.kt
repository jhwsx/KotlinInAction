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
    val client1 = Client("wangzhichao", 12345)
    val client2 = Client("wangzhichao", 12345)
    println(client1 == client2)
    println(client1 === client2)
}
/**
 * 总结：
 * 1，实例的字符串表示，重写 toString() 方法；
 * 2，在 kotlin 中，== 检查对象是否相等，就是比较值，而不是比较引用，它会编译成 java 中的 equals 调用；
 * 3，在 kotlin 中，要想比较引用，可以使用 === 运算符。
 */