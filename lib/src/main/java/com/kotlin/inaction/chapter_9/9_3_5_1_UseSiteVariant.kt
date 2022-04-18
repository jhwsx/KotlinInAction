package com.kotlin.inaction.chapter_9

/**
 *
 * @author wangzhichao
 * @since 2022/4/17
 */
// 这个函数是带不变型类型参数的数据拷贝函数
// 从 source 中读取元素，往 destination 中写入元素。
// 这两个集合元素的类型不需要精确匹配，可以把字符串的集合拷贝到可以包含任意对象的集合中。
fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}
// 使用两个泛型参数，来源的元素类型是目标的元素类型的子类型
fun <T : R, R> copyData2(source: MutableList<T>, destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

// Kotlin 提供了更优雅的表达方式：带 out 投影（投影理解为受限）类型参数的数据拷贝函数
// 当函数的实现调用了那些类型参数只出现在 out 位置的方法时，在函数定义中给特定用途的类型参数加上变型修饰符。
// out 相当于 Java 里的 ? extends
fun <T> copyData3(source: MutableList<out T>, destination: MutableList<T>) {
    // 这里为什么可以给 source 的类型参数加上 out 关键字呢？
    // 因为对 source 来说，copyData3 内部没有使用那些 T 用在 "in" 位置的方法，如 add 方法。
    for (item in source) {
        destination.add(item)
    }
}

// source 的类型使用 List<T>
// 因为 MutableList<out T> 就等同于 List<T> 了。
fun <T> copyData4(source: List<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}
// destination 的类型参数加上 in 修饰符
fun <T> copyData5(source: List<T>, destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems2 = mutableListOf<Any>()
    copyData2<Int, Any>(ints, anyItems2)
    println(anyItems2) // [1, 2, 3]

    val anyItems3 = mutableListOf<Any>()
    copyData3<Any>(ints, anyItems3)
    println(anyItems3) // [1, 2, 3]

    val anyItems4 = mutableListOf<Any>()
    copyData4<Any>(ints, anyItems4)
    println(anyItems4)

}