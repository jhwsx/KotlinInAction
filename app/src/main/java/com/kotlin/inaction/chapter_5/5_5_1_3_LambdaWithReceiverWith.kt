package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/18
 */
fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}
fun main(args: Array<String>) {
    println(alphabet3())
}

/**
 * 总结：
 * 1, 去掉了 stringBuilder 变量，而把一个新的 StringBuilder 实例直接传给 with 函数；
 * 2，这里用了表达式函数体语法。
 */