package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val people = listOf(Person("Alice",31),
        Person("Bob",29),
        Person("Carol", 31))
    val groupBy = people.groupBy { it.age }
    println(groupBy.javaClass) // 这里是一个 LinkedHashMap
    println(groupBy)
    // {31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]}
}

/**
 * 总结：
 * 1，groupBy 函数：把列表转换成分组的 map
 */
