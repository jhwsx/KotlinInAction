package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/26
 */
class Person12 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!!

    val company: String
        get() = _attributes["company"]!!

    val job: String
        get() = _attributes["job"]!!

    val age: String
        get() = _attributes["age"]!!
}

fun main(args: Array<String>) {
    val p = Person12()
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
 * 总结：
 * 1，这里实现的是一个自订对象，就是它的属性可以动态定义：这里采用的办法是将人的所有属性都存储在 map 中，
 * 不提供确切的属性；
 * 2，但是这个方法有一个不好的地方：每增加一个新的属性，都需要添加对应的 getter 方法。这就要经常修改。
 */