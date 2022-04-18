package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/7
 */
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    // filterIsInstance 接收一个集合，选择其中那些指定类的实例，然后返回这些被选中的实例。
    println(items.filterIsInstance<String>()) // [one, three]
}

/*
public inline fun <reified R> Iterable<*>.filterIsInstance(): List<@kotlin.internal.NoInfer R> {
    return filterIsInstanceTo(ArrayList<R>())
}

public inline fun <reified R, C : MutableCollection<in R>> Iterable<*>.filterIsInstanceTo(destination: C): C {
    for (element in this) if (element is R) destination.add(element)
    return destination
}
*/

/**
 * 总结：
 * 1, 这个例子展示了实化类型参数的具体应用：filterIsInstance()
 * 2, 这个函数的作用是接收一个集合，选择其中那些指定类的实例，然后
 * 返回这些被选中的实例。
 * Returns a list containing all elements that are instances of specified type parameter R.
 */