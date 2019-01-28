package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
interface JSONFactory<T> {
    fun fromJSON(jsonText: String) : T
}

class Person9(val name: String) {
    companion object : JSONFactory<Person9> {
        override fun fromJSON(jsonText: String): Person9 {
            return Person9("name")
        }
    }

    override fun toString(): String {
        return name
    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    return factory.fromJSON("xxxxx")
}

fun main(args: Array<String>) {
    println(loadFromJSON(Person9))
}

/**
 * 总结：
 * 1，在伴生对象中实现接口
 */