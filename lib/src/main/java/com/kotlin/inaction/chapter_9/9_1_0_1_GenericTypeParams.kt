package com.kotlin.inaction.chapter_9


/**
 *
 * @author wzc
 * @date 2019/6/11
 */
fun main(args: Array<String>) {
    // ArrayList<E> 是一个泛型类，它有一个泛型形参 T，当创建 ArrayList<E> 的实例时，
    // 这里类型形参 T 被替换成称为类型实参的具体类型 String。
    val list: List<String> = ArrayList<String>()
    val map: Map<String, Person> = HashMap<String, Person>()
    // kotlin 可以推导出类型实参
    val authors/*: List<String>*/ = listOf("adups", "abup")
    println(authors)
    // 创建空列表时, 不存在类型推导
    // 在变量声明中说明泛型的类型
    val readers: MutableList<String> = mutableListOf()
    // 在创建列表的函数中说明类型实参
    val readerz = mutableListOf<String>()

    // Kotlin 不支持原生态类型，类型实参必须定义。
//     val rawList: List = ArrayList()
}

/**
 * 总结：
 * 1，kotlin 不支持原生态类型（即允许使用没有类型参数的泛型类型，java1.5之前的那种）
 * 2，kotlin 的类型实参要么被显式地说明，要么可以由编译器推导出来。
 */
