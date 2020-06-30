package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/7/31
 */
class InitOrder(name: String) {
    val firstProperty = "First property: $name".also { println(it) }

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: $name".also { println(it) }

    init {
        println("Second initializer block that prints $name")
    }
}

fun main(args: Array<String>) {
    InitOrder("patient")
}

/*
* 打印结果：
* First property: patient
* First initializer block that prints patient
* Second property: patient
* Second initializer block that prints patient
*/
/**
 * 总结：
 * 1，初始化器和初始化代码块的调用顺序取决于在代码中出现的顺序。
 */