package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}
fun main(args: Array<String>) {
//    yellAt(Person(null))
    yellAtSafe(Person(null))
    val person = Person(null)
    val s: String = person.name
    val s1: String? = person.name
//    val i : Int = person.name
}

/**
 * 总结：
 * 1，注解不存在的情况下，java 的 类型会变成 kotlin 中的平台类型，即 kotlin 不知道可空性信息的类型。
 * 这种情况下，需要自己处理为 null 的情况
 */
