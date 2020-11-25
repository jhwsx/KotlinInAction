package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/14
 */
fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146)
    showProgress(-1)
    showProgress(1)
}

/**
 * 总结：
 * 1，这一节学习 kotlin 的基本数据类型；
 * 2，kotlin 中并不区分基本数据类型和包装类型；但在运行时，数字类型会尽可能地使用最高效的方式来表示。
 * 3，对于变量、属性、参数和返回类型，kotlin 的 Int 类型会被编译成 java 基本数据类型 int；但当 Int 作为泛型类型
 * 参数时，则会被编译成 java 的包装类型。
 * 4，kotlin 基本数据类型列表
 * 整数类型 - Byte、Short、Int、Long
 * 浮点类型 - Float、Double
 * 字符类型 - Char
 * 布尔类型 - Boolean
 * 可以看到，除了 Int、Char 之外，和 java 的是一致的。
 */