package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/7/16
 */
fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
            ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
//    printSum(setOf(3, 4, 5)) // Set 不是 List，抛出异常：java.lang.IllegalArgumentException: List is expected
    printSum(listOf("a", "b")) // 类型转换成功，但String 不可以调用 sum(), 抛出异常：java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Number
}

/**
 * 总结：
 * 1，这个例子展示：在 as 和 as? 转换中仍然可以使用一般的泛型类型。只要该类的基础类型正确，
 * 哪怕它的类型实参是错误的，转换也会成功。这是因为泛型擦除。需要注意的是，这样的转换编译器
 * 会报黄，unchecked cast。
 */