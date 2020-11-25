package com.kotlin.inaction.chapter_6

import java.util.*

/**
 *
 * @author wzc
 * @date 2019/2/22
 */

/**
 * 这个函数不允许传入 null 的实参。
 */
fun strLen(s: String) = s.length

/**
 * 这个函数允许传入 null 的实参，它自己处理了这种情况
 */
fun strLenSafe(s: String?): Int =
        if (s != null) s.length else 0 // 通过比较后，s 就当作非空对待了。

//fun strLenSafe2(s: String?) : Int = s.length // 不能拿一个可空类型的值去调用自己的函数

val x: String? = null
//var y: String = x // x 是可以为 null 的，而 y 是不可以是 null 的，所以不可以把 x 赋值给 y
fun main(args: Array<String>) {
//    strLen(null)
    val s: String? = null
    println(strLenSafe(s))
    println(strLen("abc"))

//    strLen(x) // x 是可以为 null 的，而strLen 的形参是不可以为 null 的，所以不能把 x 传给 strLen 方法。
}

/**
 * 总结：
 * 1，问号加在任何类型的后面表示这个类型的变量可以存储 null 引用，如
 * String? 表示这个 String 变量可以存储 null 引用。
 * 2，任何类型后面没有问号表示这种类型的变量不能存储 null 引用。
 * 3，如果值是可空类型，那么它进行的操作会有限制：
 * 不能再调用它的方法，不能把它赋值给非空类型的变量，不能把可空类型的值传给拥有非空类型参数的函数
 * 4, 可空类型最重要的操作就是和 null 比较。在比较发生的作用域内把这个值当做非空对待。
 */
