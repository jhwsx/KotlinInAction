package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
class Person10(val firstName: String, val lastName: String) {
    companion object {

    }
}

fun Person10.Companion.fromJSON(json: String) : Person10 {
    return Person10("firstName","lastName")
}

fun main(args: Array<String>) {
    println(Person10.fromJSON("json"))
}

/**
 * 总结：
 * 1，伴生对象用于扩展：这样的扩展是通过类自身调用的方法
 * 2,伴生对象定义扩展，必须要声明一个伴生对象，哪怕是一个空的也行。
 */