package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    lookForAlice3(people)
}

fun lookForAlice3(people: List<Person1>) {
    people.noinlineForEach {
        if (it.name == "Alice") {
            println("Found!")
            // 在非内联函数的 lambda 中使用 return 表达式是不允许的。
            // return
        }
    }
    println("Alice is not found")
}

fun <T> Iterable<T>.noinlineForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}