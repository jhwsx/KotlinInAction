package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/7/16
 */
fun main(args: Array<String>) {
    val list1: List<String> = listOf("a", "b")
    val list: List<Int> = listOf(1, 2)
    // 在 is 检查中不可能使用类型实参中的类型
//    if (list is List<String>) { // Cannot check for instance of erased type: List<String>
//
//    }
    // 这里虽然使用了没有指定泛型实参的泛型类型，没有报错，推测是编译器做了处理而已。因为正好 is 左边是 List。
    if (list is List) {
        println()
    }

    if (list1 is List<*>) { // 这就是星号投影语法
        println(true)
    }

    val str: Any = ""
    //
//    if (str is List) {
//        println()
//    }

    if (str is List<*>) {

    }

}

fun checkList(value: Any): Boolean {
//    return value is List<String> // 报错：Cannot check for instance of erased type: List<String>
//    return value is List // 报错，因为 Kotlin 不允许使用没有指定类型实参的泛型类型。
    return value is List<*> // OK
}

/**
 * 总结：
 * 1，kotlin 不允许使用没有指定类型实参的泛型类型；1.3.60 发现允许了.
 * 2，可以把 List<*> 看成拥有未知类型实参的泛型类型，或者类比为 java 中的 List<?>;
 * 3，仅仅是检查了 list 是不是 List，对于它的元素类型并没有检查。
 * 4, 什么是类型擦除？泛型类实例的类型实参在运行时是不保留的。
 * 5，实化：可以声明一个 inline 函数，使其类型实参不被擦除。
 * 6，上面的例子说明：在 is 检查中不可能使用类型实参中的类型
 */