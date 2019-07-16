package com.kotlin.inaction.chapter_9

import com.kotlin.inaction.chapter_3.list

/**
 *
 * @author wzc
 * @date 2019/7/16
 */
fun main(args: Array<String>) {
    val list1: List<String> = listOf("a", "b")
//    if (list is List<String>) { // Cannot check for instance of erased type: List<String>
//
//    }
//    if (list is List) { // One type argument expected. Use 'List<*>' if you don't want to pass type arguments
//
//    }

    if (list is List<*>) {
        println(true)
    }

}

/**
 * 总结：
 * 1，kotlin 不允许使用没有指定类型实参的泛型类型；
 * 2，可以把 List<*> 看成拥有未知类型实参的泛型类型，或者类比为 java 中的 List<?>;
 * 3，仅仅是检查了 list 是不是 List，对于它的元素类型并没有检查。
 */