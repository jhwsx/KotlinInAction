package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {

    val getAge = { p: Person -> p.age }
    val getAge1: (Person) -> Int = {p -> p.age}
    val getAge2: (Person) -> Int = { it.age}

    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))
}

/**
 * 总结：
 * 1，参数类型的推断
 * 2，最后一个表达式就是 lambda 的结果。
 */