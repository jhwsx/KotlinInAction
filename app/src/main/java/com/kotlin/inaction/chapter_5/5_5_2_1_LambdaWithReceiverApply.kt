package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/19
 */
fun alphabet4() = StringBuilder().apply { // 这里 apply 返回是一个 StringBuilder 对象，即接收者对象。
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabet4())
}

/**
 * 总结：
 * 1, apply 函数和 with 函数的区别是什么？
 * with 函数返回的是执行 lambda 代码的结果，该结果就是 lambda 中的最后一个表达式的值；
 * apply 函数始终返回作为实参传递给它的对象，即接收者对象。
 * 2，apply 函数被声明为一个扩展函数，它的接收者变成了作为实参的 lambda 的接收者。
 */