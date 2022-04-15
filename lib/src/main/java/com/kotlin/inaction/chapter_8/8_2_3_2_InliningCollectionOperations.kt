package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */

fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    val result = mutableListOf<Person1>()
    for (person in people) {
        if (person.age < 30) {
            result.add(person)
        }
    }
    println(result)
}
