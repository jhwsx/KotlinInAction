package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
data class Person1(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++;
    }
}

fun main(args: Array<String>) {
    // 使用 let 函数
    Person1("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }
    // 不使用 let 函数
    val person1 = Person1("Alice", 20, "Amsterdam")
    println(person1)
    person1.moveTo("London")
    person1.incrementAge()
    println(person1)
}
