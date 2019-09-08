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

/**
 * 总结：
 * 1，这是在map中保存属性值的例子
 * 2，从这个例子中需要得出一点：
 * by 右边的表达式不一定是新创建的实例，也可以是函数调用、另一个属性或任何其他表达式，只要这个表达式的值，是
 * 能够被编译器用正确的参数类型来调用 getValue 和 setValue 的对象
 */
