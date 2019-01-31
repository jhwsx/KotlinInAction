package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/30
 */
data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf<Person>(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    // 使用 lambda
    println(people.maxBy { it.age })
    // 用成员引用搜索
    println(people.maxBy(Person::age))
}

/**
 * 总结：
 * 1，上面的例子中 {it.age} 是一个 lambda；maxBy 函数可以在任意集合上调用，且只需要一个实参：一个函数，指定
 * 比较哪个值来找到最大元素。花括号中的 { it.age } 就是实现了这个逻辑的 lambda。它接收一个集合中的元素作为
 * 实参（使用 it 引用它）并且返回用来比较的值。
 * 2，如果 lambda 刚好是函数或者属性的委托，可以用成员引用替换。
 */
