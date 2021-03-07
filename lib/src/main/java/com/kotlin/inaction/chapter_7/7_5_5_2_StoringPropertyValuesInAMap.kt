package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/26
 */
class Person13 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
    val company: String by _attributes
    val job: String by _attributes
    val age: String by _attributes
}

fun main(args: Array<String>) {
    val p = Person13()
    val data = mapOf(
        "name" to "wzc",
        "company" to "adups",
        "job" to "coder",
        "age" to "31")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }
    println(p.name)
    println(p.company)
    println(p.job)
    println(p.age)
}

/**
 * 1, 使用委托属性，仅仅是写的简单一些而已。
 * 2, 为什么可以这样用？因为标准库已经在 Map 和 MutableMap 接口上定义了 getValue 和 setValue 扩展函数。
 * 位置是在 MapAccessors.kt 中。可以通过 Map 对象.setValue 找到。
 */
