package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/10
 */
fun main(args: Array<String>) {
    val canBeInClub27 = {p: Person -> p.age <= 27}
    val people = listOf(
        Person("Alice", 27),
        Person("Bob", 31)
    )
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
}
/**
 * 总结：
 * 1，all 函数：判断是否所有元素都满足条件；
 * 2，any 函数，判断集合中是否至少存在一个匹配的元素；
 */