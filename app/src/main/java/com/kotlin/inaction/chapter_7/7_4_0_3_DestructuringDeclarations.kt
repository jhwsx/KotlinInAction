package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result: List<String> = fullName.split(".", limit = 2)
    return NameComponents(result[0], result[1])

}

fun main() {
    val (name, extension) = splitFileName("helloworld.kt")
    println(name)
    println(extension)
}

/**
 * 总结：
 * 1, 使用解构声明来返回多个值：把返回的多个值封装在一个数据类中，然后在使用的时候使用解构声明来展开它。
 * 2，具体可以查看 _Collections.kt 中定义的集合的扩展函数
 *
 * @kotlin.internal.InlineOnly
 * public inline operator fun <T> List<T>.component2(): T {
 *      return get(1)
 * }
 * 3，还可以使用 Pair 类，Triple 类来达到同样的效果。
 */