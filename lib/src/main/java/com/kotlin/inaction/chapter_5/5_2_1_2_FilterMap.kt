package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/9
 */
fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )
    println("traverse old people")
    for (p in people) {
        println(p.hashCode())
    }
    val newPeople = people.filter { it.age > 30 }
    println("traverse new people")
    for (p in newPeople) {
        println(p.hashCode())
    }
}

/**
 * 总结：
 * 1, filter 函数产生的新集合里装的还是旧元素，这就是新瓶装旧酒。
 * 2, filter 函数并不会改变这些元素的。
 */