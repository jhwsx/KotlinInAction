package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
// 这是一个带类型参数约束的函数
fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
    // 提示：Call replaceable with binary operator
//    return if (first.compareTo(second) > 0) first else second
}
fun main(args: Array<String>) {
    println(max("kotlin", "java"))
    println(max("kotlin", "objectc"))
    println(max("kotlin", "c"))
    println(max("kotlin", "python"))
//    println(max("kotlin", 42))
}

/**
 * 总结：
 * 1, T 的上界是泛型类型 Comparable<T>；
 * 2，上面的 first > second,会被编译成 first.compareTo(second) > 0,这是因为对于 Comparable
 * 接口，接口中的 compareTo 方法可以使用 > , <, <= 和 >= 来重载。
 */