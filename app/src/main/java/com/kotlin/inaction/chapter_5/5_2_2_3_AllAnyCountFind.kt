package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val canBeInClub27 = {p: Person -> p.age <= 27}
    val people = listOf(
        Person("Alice", 27),
        Person("Bob", 31)
    )
    println(people.count(canBeInClub27))
}
/**
 * 总结：
 * count 函数，统计满足条件的元素个数
 */