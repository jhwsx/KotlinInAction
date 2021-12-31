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
    val getAge3 = fun(p: Person): Int {
        return p.age
    }
    println(getAge3(Person("wzc", 18)))
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
 * 3，注意：lambda 的结果不要写 return
 * 4，lambda 不支持写出返回值的类型。
 */