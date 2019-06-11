package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
val <T> List<T>.penultimate: T
    get() = this[size-2]
//val <T> x: T =
fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).penultimate)
}
/**
 * 总结：
 * 1, 声明泛型的扩展属性；
 * 2，不能声明泛型非扩展属性。
 */