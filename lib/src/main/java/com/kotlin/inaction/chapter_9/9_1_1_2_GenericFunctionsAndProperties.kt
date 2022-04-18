package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
fun main(args: Array<String>) {
    val icompanies = listOf("adups", "abup")
    val firms = mutableListOf("adups", "abup", "apple", "alphabet", "amazon")
    // inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T>
    // 在 filter 函数的声明中，它接收一个函数类型 (T) -> Boolean 的参数，因为是在 Iterable<T> 上调用，而它的接收者
    // firms 的真实类型是 List<String>，所以编译器推断 T 就是 String。
    val filter = firms.filter<String> { it !in icompanies }
    println(filter)
}
/**
 * 总结：
 * 1, 调用泛化的高阶函数
 */