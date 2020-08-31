package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
    println("---------------------------------------")
    val block: (MutableList<String>).() -> Unit = {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
    with(numbers, block)
    println("---------------------------------------")
    val block2: (MutableList<String>).() -> Unit = fun (MutableList<String>).() : Unit {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
    with(numbers, block2)
}

/**
 * 总结：
 * 1，使用 with 函数，不使用它的 lambda 结果
 */