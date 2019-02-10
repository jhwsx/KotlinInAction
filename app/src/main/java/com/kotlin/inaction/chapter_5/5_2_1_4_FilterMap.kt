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
    val names = people.map { it.name }
    println(names)

    // 用成员引用的方式
    val newNames = people.map(Person::name)
    println(newNames)
    //todo 下边这样写，是报错的，不知道为啥了？？？
//    val newNamess = people.map { it::name }
//    println(newNamess)
}