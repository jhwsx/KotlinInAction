package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
fun main(args: Array<String>) {
    // kotlin 可以推导出实参类型
    val authors = listOf("adups", "abup")
    println(authors)
    // 创建空列表时, 不存在类型推导
    // 在变量声明中说明泛型的类型
    val readers: MutableList<String> = mutableListOf()
    // 在创建列表的函数中说明类型实参
    val readerz = mutableListOf<String>()
}

/**
 * 总结：
 * 1，kotlin 不支持原生态类型（即允许使用没有类型参数的泛型类型，java1.5之前的那种）
 * 2，kotlin 的类型实参要么被显式地说明，要么可以由编译器推导出来。
 */
