package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println("map:" + strings.map { it.toList() }) // map:[[a, b, c], [d, e, f]]
    println("flatMap: " + strings.flatMap { it.toList() }) // flatMap: [a, b, c, d, e, f]
    println("myflatMap: " + strings.myflatMap { it.toList() }) // myflatMap: [a, b, c, d, e, f]
    val list = listOf(listOf(1, 2), listOf(3, 4))
    println("flatten:" + list.flatten()) // flatten:[1, 2, 3, 4]
    println("myFlatten:" + list.myFlatten()) // flatten:[1, 2, 3, 4]
    val list2 = listOf("12", "34")
    val map = list2.map { it.toList() }
    println("map:" + map)
    val flatten = map.flatten()
    println("flatten:$flatten")
    val flatMap = list2.flatMap { it.toList() }
    println("flatMap:$flatMap")
}

fun <T, R> Iterable<T>.myflatMap(transform: (T) -> Iterable<R>): List<R> {
    val result = ArrayList<R>()
    for (element in this) {
        // map: 变换
        val list = transform(element)
        // flat: 平铺
        result.addAll(list)
    }
    return result
}

fun <T> Iterable<Iterable<T>>.myFlatten(): List<T> {
    val result = ArrayList<T>()
    for (element in this) {
        // flat：平铺
        result.addAll(element)
    }
    return result
}
/**
 * 总结：
 * flatMap 函数：首先根据实参给定的函数对集合中的每个元素做变换（或者说映射），然后把多个列表合并（或者说平铺）成一个列表。
 * flatten 函数：把多个列表合并（或者说平铺）成一个列表。
 * flatMap 中的 map 是变换的意思，不要理解为集合，这是一个误区。
 */
