package com.kotlin.inaction.blog.delegate._02_builtin_delegates

/**
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Person(name: String, lastname: String) {
    val fullName: String by lazy { name + lastname }
}

fun main() {
    val person = Person("john", "bush")
    println(person.fullName)
}