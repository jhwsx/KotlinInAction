package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/18
 */
fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun main(args: Array<String>) {
    println(alphabet())
}

/**
 * 总结：
 * 1，这个例子对 result 执行了好几个不同的方法，而且每次都要重复 result 这个名字。
 */