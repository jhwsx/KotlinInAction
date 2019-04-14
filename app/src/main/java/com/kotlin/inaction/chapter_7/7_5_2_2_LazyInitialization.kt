package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
class Email1

fun loadEmail1(person: Person2): List<Email1> {
    println("load emails for ${person.name}")
    return listOf()
}

class Person2(val name: String) {
    val emails by lazy { loadEmail1(this) }
}

fun main() {
    val p = Person2("wzc")
    p.emails
    p.emails
}

/**
 * 总结：
 * 1, lazy 函数返回一个对象，该对象具有一个名为 getValue 且签名正确的方法，
 * 可以把它与 by 关键字一起使用来创建一个委托属性。
 * 2，lazy 函数的参数是一个 lambda，调用它来初始化 emails。
 */