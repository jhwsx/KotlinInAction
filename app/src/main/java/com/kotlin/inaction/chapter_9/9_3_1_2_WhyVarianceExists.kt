package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/12
 */
fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main(args: Array<String>) {
    val strings = mutableListOf("abc", "bac")
//    addAnswer(strings) // 此行编译不通过，
    // Type mismatch.
    // Required:
    // MutableList<Any>
    // Found:
    // MutableList<String>

}

/**
 * 总结：
 * 1，把一个字符串列表传给期望 Any 对象列表的函数是否安全呢？
 * 如果函数接收的是只读列表，那么它的类型就不会改变，这是安全的；
 * 如果函数接收的是可变列表，那么它的类型就可能改变，这是不安全的。
 */