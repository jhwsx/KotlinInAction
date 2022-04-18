package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/13
 */
fun testVariant1(list: List<Any>) {

}

fun testVariant2(list: List<Number>) {

}

fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3)

    val anyList: List<Any> = list

    val any = anyList[0]
    println("any is Int: ${any is Int}")
    println(any)

    val numberList: List<Number> = list // List<Int> 是 List<Number> 的子类型
    val number = numberList[1]

    println("number is Int: ${number is Int}")

    println(number)

    testVariant1(list)

    testVariant2(list)
}

/**
 * 总结：
 * 1，这个例子学习协变的术语：
 * 如果 A 是 B 的子类型，那么 List<A> 就是 List<B> 的子类型，就说像 List 这样的
 * 类或者接口是协变的。
 * 2，这里要特别说明一下，Kotlin 中的 List 接口与 Java 中的 List 接口不一样，Kotlin 中的 List
 * 接口是只读集合。
 */