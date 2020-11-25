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
    var count = 0
    people.filter { it.age == people.maxBy(Person::age.also {
        println("执行次数：${++count}")
    })!!.age }
    println("++++++++++++++++++++++++++++")
    count = 0
    val maxAge = people.maxBy(Person::age.also {
        println("执行次数：${++count}")
    })!!.age
    people.filter { it.age == maxAge }

}

/**
 * 总结：
 * 1, 把 maxBy 执行的结果保留一份，再执行 filter，可以减少 maxBy 重复计算。
 */