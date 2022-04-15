package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    lookForAlice4(people)
}

fun lookForAlice4(people: List<Person1>) {
    people.noinlineForEach2 {
        if (it.name == "Alice") {
            // 使用局部返回，会终止 lambda 的执行，并接着从调用 lambda 的代码处执行。
            // 局部返回要用到标签。
                // 这里的作用就是终止 for 循环了，跟 break 一样的。
            return@noinlineForEach2 // 使用函数名作为 return 标签
        }
    }
    println("Alice might be somewhere")
}

fun lookForAlice5(people: List<Person1>) {
    people.noinlineForEach2  label@{
        if (it.name == "Alice") {
            return@label // 自己写任何一个标识符作为 return 标签
        }
    }
    println("Alice might be somewhere")
}

fun lookForAlice6(people: List<Person1>) {
    people.forEach {
        if (it.name == "Alice") {
            return@forEach // 使用函数名作为 return 标签
        }
    }
    println("Alice might be somewhere")
}

fun <T> Iterable<T>.noinlineForEach2(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}