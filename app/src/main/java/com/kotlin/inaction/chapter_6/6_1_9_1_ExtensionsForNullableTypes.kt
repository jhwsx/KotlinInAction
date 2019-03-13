package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
/**
 * 总结：
 * 1，为可空类型定义扩展函数，来处理 null 值；
 * 2，这里展示的是 Kotlin 标准库中 Strings.kt 定义的 String 的扩展函数 isNullOrBlank；
 * 3，调用这个扩展函数时，不需要再安全调用；
 * 4，为可空类型定义扩展函数，就是说在一个类型后面跟着一个?, 这就表明这个类型时可空的；
 * 5，在 java 中 this 永远是非空的，而在 kotlin 中，在可空类型的扩展函数中，this 可以为 null。
 */