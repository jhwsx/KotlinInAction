package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )
    println(people.filter { it.age > 30 }.map(Person::name))
}

/**
 * 总结：
 * 1，链接调用的用法。
 */