package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/3/28
 */
fun main(args: Array<String>) {
    val list = arrayListOf(1, 2)
    list += 3 // 因为 ArrayList 可变集合，所以这里 += 是修改集合

    val newList = list + listOf(4, 5) // + 返回一个新的集合

    println("list=$list, hashCode=${list.hashCode()}")

    println("newList=$newList, hashCode=${newList.hashCode()}")

    val list1 = newList - list

    println("list1=$list1, hashCode=${list1.hashCode()}")
}

/**
 * 总结：
 * 1，+， += 用于集合
 * 2, +, - 运算符总是返回新的集合。
 */