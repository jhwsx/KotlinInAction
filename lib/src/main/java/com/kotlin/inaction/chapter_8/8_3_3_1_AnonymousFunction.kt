package com.kotlin.inaction.chapter_8

/**
 * 匿名函数：默认使用局部返回
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val people = listOf(Person1("Bob", 31),Person1("Alice", 29))
    lookForAlice7(people)
    lookForAlice8(people)
    people.filter(fun (person): Boolean {
        return person.age < 30
    })
    people.filter(fun (person) = person.age < 30)
}

fun lookForAlice7(people: List<Person1>) {
    // 匿名函数与普通函数比较：匿名函数省略了函数名和参数类型。
    // 但是，匿名函数是一个对象，是 lambda 表达式的另一种语法形式而已，不要忘记这一点。
    people.forEach(fun (person) {
        // 在匿名函数中，不带标签的 return 表达式会从匿名函数返回，
        // 而不是从包含匿名函数的函数返回。
        // return 从最近的使用 fun 关键字声明的函数返回。
        if (person.name == "Alice") return // 这里的作用类似 continue
        println("${person.name} is not Alice")
    })
    println("lookForAlice7 end")
}

fun lookForAlice8(people: List<Person1>) {
    for (person in people) {
        if (person.name == "Alice") continue // 这里的作用类似 continue
        println("${person.name} is not Alice")
    }
    println("lookForAlice8 end")
}
/*
打印：
Bob is not Alice
lookForAlice7 end
 */
