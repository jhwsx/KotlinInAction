package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/26
 */
class Client1(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client1) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    fun equals(other: Client1) {

    }

    override fun toString(): String {
        return "Client1(name=$name, poastalCode=$postalCode)"
    }
}

fun main(args: Array<String>) {
    val client1 = Client1("wangzhichao", 12345)
    val client2 = Client1("wangzhichao", 12345)
    val client3 = Client1("wangzhichao", 23456)
    println(client1 == client2)
    println(client1 == client3)
    println(client1 === client2)
}
/**
 * 总结：
 * 1，这里重写了 equals 方法：
 * Any 是 java.lang.Object 的模拟，在 kotlin 中，是所有类的父类；
 * Any? 意思是 other 这个参数是可以为空的；
 * is 检查是对 java 的 instanceOf 的模拟，而 !is运算符表示 is 检查的非运算。
 * 2，重写一个方法是 override 修饰符是强制的。
 */