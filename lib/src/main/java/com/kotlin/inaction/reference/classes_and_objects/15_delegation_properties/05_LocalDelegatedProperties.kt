package com.kotlin.inaction.reference.classes_and_objects.`15_delegation_properties`

/**
 * @author wangzhichao
 * @date 2019/09/08
 */
fun load(load: Boolean) {
    println("load($load)")
    val grades by lazy { loadGrades() }
    if (load) {
        println(grades)
    }
}

fun loadGrades(): Map<String, Int> {
    println("loadGrades")
    val map = mutableMapOf<String, Int>()
    map["english"] = 100
    map["chinese"] = 100
    map["math"] = 100
    return map
}

fun main(args: Array<String>) {
    load(true)
    println("---------------------")
    load(false)
}

/*
打印结果：
load(true)
loadGrades
{english=100, chinese=100, math=100}
---------------------
load(false)
*/

/**
 * 总结：
 * 1，从1.1开始，可以声明局部变量为委托属性了。
 */