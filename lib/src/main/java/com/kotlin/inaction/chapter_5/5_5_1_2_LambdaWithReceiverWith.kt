package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/18
 */
fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) { // 指定 lambda 的接收者
        for (letter in 'A'..'Z') {
            this.append(letter) // 显式地通过 this 调用 StringBuilder 的 append 方法。
        }
        append("\nNow I know the alphabet!") // 省掉 this，也可以调用 StringBuilder 的 append 方法。
        this.toString() // 从 lambda 返回值，这里是一个 String。
    }
}

fun myalphabet2(): String {
    val stringBuilder = StringBuilder()
    return mywith(stringBuilder) {
        for (letter in 'a'..'z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun <T, R> mywith(receiver: T, block: T.() -> R): R {
    return receiver.block()
}

fun mywith2(receiver: StringBuilder, block: StringBuilder.() -> String): String {
    return receiver.block()
}

fun main(args: Array<String>) {
    println(alphabet2())
    println(myalphabet2())
}

/**
 * 总结：
 * 1, with 结构实际上是一个接收两个参数的函数：这里第一个参数是 stringBuilder，第二个参数是 lambda。
 * 2，with 函数把它的第一个参数转换成作为第二个参数传给它的 lambda 的接收者。可以显式地通过 this 引用来访问这个接收者。
 * 不用任何限定符就可以访问接收者的方法和属性。
 * 3，with 函数返回的值是执行 lambda 代码的结果，该结果就是 lambda 中的最后一个表达式的值。
 */