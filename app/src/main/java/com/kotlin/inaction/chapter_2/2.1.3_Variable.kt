package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2018/12/25
 */
fun main(args: Array<String>) {
    val question = "The Ultimate Question of Life, the Universe, and Everything"

    val answer = 42

    val answer1: Int = 42 // 有初始化器

    val answer2: Int // 没有初始化器
    answer2 = 42

    val message: String
    if (answer > 42) {// 这不算再次赋值
        message = "Sucess"
    } else {
        message = "Failed"
    }

    val languages = arrayListOf<String>("Java") // 指向的对象可以改变
    languages.add("Kotlin")
    println(languages)
}

/*
总结：
1，初始化器，推导变量的类型
2，val（来自 value）-不可变引用；
3，var（来自 variable）- 可变引用。
 */