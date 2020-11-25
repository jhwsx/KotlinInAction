package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 27),
        Person("Alice1", 27),
        Person("Bob", 31)
    )
    val canBeInClub27 = {p: Person -> p.age <= 27}
    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))
    val isOld = {p: Person -> p.age >= 60}
    println(people.find(isOld))
    println(people.firstOrNull(isOld))
}
/**
 * 总结：
 * find 函数：找到第一个满足条件的元素
 */