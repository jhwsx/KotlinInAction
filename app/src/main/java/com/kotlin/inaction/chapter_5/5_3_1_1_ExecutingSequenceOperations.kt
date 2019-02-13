package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/13
 */
fun main(args: Array<String>) {
    val people = listOf<Person>(
        Person("Alice", 29),
        Person("Bob", 31)
    )
    val asSequence = people.asSequence()
    println(asSequence.hashCode())
    val map = asSequence.map(Person::name)
    println(map.hashCode())
    val filter = map.filter { it.startsWith("A") }
    println(filter.hashCode())
    println(filter.toList())

    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList())

}