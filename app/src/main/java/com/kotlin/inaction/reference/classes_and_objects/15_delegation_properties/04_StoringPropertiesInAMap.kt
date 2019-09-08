package com.kotlin.inaction.reference.classes_and_objects.`15_delegation_properties`

/**
 * @author wangzhichao
 * @date 2019/09/08
 */
class User2(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int by map
}

fun main(args: Array<String>) {
    val user = User2(mapOf(
            "name" to "wzc",
            "age" to 31
    ))
    println(user.name)
    println(user.age)
    // user.name = "wzj"
    println("-------------------------------")

    val mutableUser = MutableUser(mutableMapOf(Pair("name", "wzc"), Pair("age", 18)))
    println("name=${mutableUser.name}, age=${mutableUser.age}")
    mutableUser.name = "wzj"
    mutableUser.age = 19
    println("name=${mutableUser.name}, age=${mutableUser.age}")
}
