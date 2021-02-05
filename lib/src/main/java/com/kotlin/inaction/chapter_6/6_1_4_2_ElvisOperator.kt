package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/27
 */
fun strLenSafe1(s: String?): Int {
    if (s != null) {
        return s.length
    } else {
        return 0
    }
}

fun strLenSafe2(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strLenSafe1("wangzhichao"))
    println(strLenSafe2("wangzhichao"))
    println(strLenSafe1(null))
    println(strLenSafe2(null))
    assert(playerName(null) == "Guest")
    assert(playerName("Peter") == "Peter")
}

fun playerName(name: String?): String {
    return name ?: "Guest"
}

fun playerName2(name: String?): String {
    return name ?: throw Exception("Cannot be null")
}

fun playerName3(name: String?): String {
    return name ?: return ""
}

/**
 * 总结：
 * 1，Elvis 运算符和安全调用运算符一起使用的例子：用一个值来代替对 null 对象调用方法时返回的 null。
 */