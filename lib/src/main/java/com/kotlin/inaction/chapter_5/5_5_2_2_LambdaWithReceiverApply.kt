package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/20
 */
fun alphabet5() = buildString { // 这里 apply 返回是一个 StringBuilder 对象，即接收者对象。
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main(args: Array<String>) {
    println(alphabet5())
}

/**
 * 总结：
 * 1，使用标准库函数 buildString 进一步简化 apply 函数：负责创建 StringBuilder 并调用 toString
 * 2，buildString 的实参是一个带接收者的 lambda，接收者就是 StringBuilder。
 */