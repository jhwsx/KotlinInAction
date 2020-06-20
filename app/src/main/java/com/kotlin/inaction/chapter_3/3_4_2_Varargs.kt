package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun main(args: Array<String>) {
    val list = listOf(2, 3, 5, 7, 11)
    val list1 = listOf("args: ", *args)
    println(list1)
    val array = arrayOf(1,2,3)
    val toIntArray = array.toIntArray()
    show(*toIntArray)
}
// 可变参数的关键字时 vararg
fun show(vararg elements: Int) {
    println(elements.joinToString())
}

/**
 * 总结：
 * 1，Kotlin 要求显式地解包数组，* 是展开运算符，通过它，可以在单个调用中组合来自数组的值和某些固定值。
 * 2, 展开运算符就是显式地解包数组，以便每一个数组元素都能作为单独的参数来调用。
 */
// TODO IntArray，与 Array 有什么区别？