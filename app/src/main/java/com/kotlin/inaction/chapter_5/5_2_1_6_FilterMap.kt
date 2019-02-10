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
    people.filter { it.age == people.maxBy(Person::age)!!.age }
}

/**
 * 总结：
 * 1, 这里用到了 !! ，not-null asserted，这保证了寻找最大年龄的过程只执行一次。
 */