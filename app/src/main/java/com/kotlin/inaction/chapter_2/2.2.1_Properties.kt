package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2018/12/27
 */
class Person(val name: String,
             var isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person)
    println(person.name)
    println(person.isMarried)
    person.isMarried = false
    println(person.isMarried)

    val people = People("May", false)
    println(people)
    println(people.name)
    println(people.isMarried)

}
/*
* 总结：
* 1，Kotlin 中的 Person 和 Java 中的 People 是等价的，可以看到 kotlin要更加简洁
* 2，只有数据没有其他代码的对象呗称为值对象，如上面的 Person 类
* 3，在 Kotlin 中，public 是默认的可见性。
* 4，在 Kotlin 中，属性是<b>头等</b>的语言特性，完全替代了字段和访问器方法
* 5，对于在 Java 中定义的类，一样可以使用 Kotlin 的属性语法*/