package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {
    val people = listOf<Person>(Person("Alice", 29), Person("Bob", 31))
    // 把 lambda 表达式作为命名实参传递
    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    // 把 lambda 表达式放在圆括号的后边,不能再用命名实参方式了
    val namez = people.joinToString(separator = " ") { p: Person -> p.name }
    println(names)
    println(namez)
}

/**
 * 总结：
 * 1，把 lambda 表达式作为命名实参传递
 */