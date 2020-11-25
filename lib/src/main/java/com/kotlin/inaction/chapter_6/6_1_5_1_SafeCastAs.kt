package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/1
 */
fun boo(x: Any) {
    val number = x as Number
    println(number)
}

fun boo1(x: Any?) {
    val number = x as? Number
    println(number)
}

fun boo2(x: Any) {
    if (x is Number) {
        println(x)
    } else {
        println(null)
    }
}
fun main(args: Array<String>) {
    boo1(5)
    boo1("b")
    boo1(null)
    boo2(5)
    boo2("b")
    boo(5)
    boo("b")

}

/**
 * 总结：
 * 1，as? 运算符作用是尝试把值转换成指定的类型，如果类型不合适就返回 null，这样可以实现安全转换。
 * 2，as? 运算符的左边是一个值，右边是一个指定的类型。
 */