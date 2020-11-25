package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/11
 */
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance1<String>())
}


inline fun <reified T> Iterable<*>.filterIsInstance1(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}

/**
 * 总结:
 * 1, 这里是自己手写一个 filterIsInstance 函数, 注意不加 inline 是会编译报错的:
 * Only type parameters of inline functions can be reified.
 * 2, 这里可以在可以在函数体内使用类型实参 T.
 * 3, reified 声明了类型参数不会在运行时被擦除
 *
 */