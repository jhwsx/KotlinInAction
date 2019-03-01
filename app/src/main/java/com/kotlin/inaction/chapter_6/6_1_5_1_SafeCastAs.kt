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