package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/7
 */
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}
/**
 * 总结：
 * 1, 这个例子展示了实化类型参数的具体应用：filterIsInstance()
 * 2, 这个函数的作用是接收一个集合，选择其中那些指定类的实例，然后
 * 返回这些被选中的实例。
 * Returns a list containing all elements that are instances of specified type parameter R.
 */