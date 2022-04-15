package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    lookForAlice2(people)
}

fun lookForAlice2(people: List<Person1>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            // 如果在 lambda 中使用 return 关键字，它会从调用 lambda 的函数中返回，
            // 并不只是从 lambda 中返回。这样的 return 语句叫做非局部返回，因为它从
            // 一个比包含 return 的代码块更大的代码块中返回了。

            // 需要注意的是，只有在以 lambda 作为参数的函数是内联函数的时候才能从更外层的函数返回。
            return
        }
    }
    println("Alice is not found")
}