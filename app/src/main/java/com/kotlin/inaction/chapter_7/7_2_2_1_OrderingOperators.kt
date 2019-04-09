package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/9
 */
class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 <= p2)
}

/**
 * 总结：
 * 1，在 kotlin 中，Comparable 接口定义的 compareTo 方法可以按约定调用，比较运算符
 * （<,>,<= 和 >=）的使用将被转换为 compareTo。
 * 2，而在 java 中，只有基本数据类型能使用 > 和 < 进行比较；
 * 3，学习 kotlin 标准库中的 compareValuesBy 函数来简洁地实现 compareTo 方法
 */