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
    val wzc = User5() // 这个就是额外生成的不带参数的构造方法，但使用了所有的默认值
    println("nickname=${wzc.nickname},isSubscribed=${wzc.isSubscribed}")
    val john = User5("John")
    println("nickname=${john.nickname},isSubscribed=${john.isSubscribed}")

    val peter = User5("Peter", false)
    println("nickname=${peter.nickname},isSubscribed=${peter.isSubscribed}")

    val may = User5("May", isSubscribed = false)
    println("nickname=${may.nickname},isSubscribed=${may.isSubscribed}")

    val tiger = User5(isSubscribed = false, nickname = "Tiger")
    println("nickname=${tiger.nickname},isSubscribed=${tiger.isSubscribed}")
}

/**
 * 总结：
 * 1，可以给构造方法参数提供一个默认值;
 * 2, 可以显式地为某些构造方法参数标明名称。
 * 3, 如果所有的构造方法参数都有默认值，编译器会生成一个额外的不带参数的构造方法来使用所有的默认值。
 */