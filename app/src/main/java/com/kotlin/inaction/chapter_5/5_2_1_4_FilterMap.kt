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
    // 下面这种写法看起来很麻烦，不过也是正确的。
    // it::name 是一个函数引用的对象，后面加括号就是调用它了，得到它的返回值。
    val newNamess = people.map { (it::name)() }
    println(newNamess)
}