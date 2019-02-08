package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/6
 */
val getAge = Person ::age

fun main(args: Array<String>) {
    val people = listOf(
        Person("wzc", 30),
        Person("wcg", 6),
        Person("wcx", 2)
    )
    println(people.maxBy(getAge))
}

/**
 * 总结：
 * 1，传递已经被定义成了函数的代码块，使用成员引用：把函数转换成一个值，就可以传递了，使用 :: 运算符。
 * 双引号把类名称和要引用的成员名称隔开
 *
 */