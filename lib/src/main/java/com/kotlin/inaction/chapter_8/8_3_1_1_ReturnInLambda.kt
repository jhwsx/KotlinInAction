package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    lookForAlice(people)
}

fun lookForAlice(people: List<Person1>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}