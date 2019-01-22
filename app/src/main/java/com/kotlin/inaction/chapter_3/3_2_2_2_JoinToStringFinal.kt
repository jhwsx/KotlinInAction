package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/11
 */
fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
):String { // 有默认值的参数
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
@JvmOverloads
fun <T> joinToString3(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
):String { // 有默认值的参数
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = setOf(1, 2, 3)
    println(joinToString2(list, ", ", "{","}"))
    println(joinToString2(list, ", ", "", ""))
    println(joinToString2(list))
    println(joinToString2(list, "; "))
    println(joinToString2(list, separator = "、", prefix = "{", postfix = "}"))
}

/**
 * 总结：
 * 1，在 kotlin 中，声明函数的时候，给参数指定默认值，这样可以避免创建重载的函数；
 * 2，对于有默认参数值的函数，一般调用时，必须按照函数声明中定义的参数顺序来给定参数；
 * 3，对于有默认参数值得函数。使用命名参数调用时，可以省略中间的一些参数，也可以任意指定调用顺序。
 */