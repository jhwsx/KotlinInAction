package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/21
 */
class User5(
    val nickname: String = "wzc",
    val isSubscribed: Boolean = true
)

fun main(args: Array<String>) {
    val john = User5("John")
    println(john.isSubscribed)

    val peter = User5("Peter", false)
    println(peter.isSubscribed)

    val may = User5("May", isSubscribed = false)
    println(may.isSubscribed)

    val tiger = User5(isSubscribed = false, nickname = "Tiger")
    println(tiger.isSubscribed)
}

/**
 * 总结：
 * 1，可以给构造方法参数提供一个默认值;
 * 2, 可以显式地为某些构造方法参数标明名称。
 * 3, 如果所有的构造方法参数都有默认值，编译器会生成一个额外的不带参数的构造方法来使用所有的默认值。
 */