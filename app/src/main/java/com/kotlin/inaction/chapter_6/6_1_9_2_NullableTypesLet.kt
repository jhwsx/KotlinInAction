package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/10/24
 */
fun main(args: Array<String>) {
    val person: Person? = null
//    person.let { printP(it) } // 此行 it 是可空类型的，类型不匹配
}

private fun printP(person: Person) {
    print(person)
}

/**
 * 总结：
 * 1，let 函数可以被可空的接收者调用，但是 let 函数不检查值是否为 null；
 * 2，在一个可空类型上直接调用 let 函数，那么 lambda 的实参时是可空的。
 */
