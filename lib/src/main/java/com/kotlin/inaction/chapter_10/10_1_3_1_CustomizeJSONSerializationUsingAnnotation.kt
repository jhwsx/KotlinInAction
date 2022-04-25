package com.kotlin.inaction.chapter_10

import ru.yole.jkid.JsonExclude
import ru.yole.jkid.JsonName
import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize

/**
 *
 * @author wangzhichao
 * @since 2022/4/19
 */
data class Person10(val name: String, val age: Int)

data class Person11(
    @JsonName("alias")
    val firstName: String,
    // 排除了：如果不提供默认值，反序列化会报错：ru.yole.jkid.deserialization.JKidException: Missing value for parameter age
    @JsonExclude
    val age: Int? = null
)

fun main() {
    // 序列化
    val person = Person10("willwaywang6", 42)
    println(serialize(person))
    // 反序列化
    val json = """{"name": "willwaywang6", "age": 42}"""
    println(deserialize<Person10>(json))

    val person11 = Person11("willwaywang6", 42)
    println(serialize(person11))
    val json11 = """{"alias": "willwaywang6"}"""
    println(deserialize<Person11>(json11))
}

/*
{"age": 42, "name": "willwaywang6"}
Person10(name=willwaywang6, age=42)
{"alias": "willwaywang6"}
Person11(firstName=willwaywang6, age=null)
*/