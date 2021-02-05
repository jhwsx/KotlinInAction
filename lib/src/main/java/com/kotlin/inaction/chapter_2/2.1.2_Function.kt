package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2018/12/24
 */
fun max(a: Int, b: Int): Int { // 代码块体
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b // 表达式体

fun max3(a: Int, b: Int) = if (a > b) a else b // 只有表达式体函数的返回类型可以省略

fun main(arg: Array<String>) {
    println(max(1, 2))
    println(isEven(2))
}

//fun isEven(number: Int): Boolean {
//    return number % 2 == 0
//}

fun isEven(number: Int): Boolean = number % 2 == 0

/*
总结：
1，在Kotlin中，if 是有结果的表达式。
2，代码块体（block body）: 函数体写在花括号里面
表达式体（expression body）： 函数直接返回一个表达式，没有花括号。
3，类型推导
 */