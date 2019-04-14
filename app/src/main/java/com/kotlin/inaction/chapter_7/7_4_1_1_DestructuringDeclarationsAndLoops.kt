package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    val map = mapOf(
        "Z40" to "Shanghai-Zhengzhou",
        "K154" to "Zhengzhou-Shanghai"
    )
    printEntries(map)
}

/**
 * 总结：
 * 1, 解构声明调用的是  Maps.kt 中的
 *  @kotlin.internal.InlineOnly
 *  public inline operator fun <K, V> Map.Entry<K, V>.component1(): K = key
 *
 *  @kotlin.internal.InlineOnly
 *  public inline operator fun <K, V> Map.Entry<K, V>.component2(): V = value
 * 2, Map 能够使用 in 运算符是因为有一个定义好的 iterator 扩展函数。
 * @kotlin.internal.InlineOnly
 * public inline operator fun <K, V> Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>> = entries.iterator()
 */