package com.kotlin.inaction.reference.classes_and_objects

import kotlin.properties.Delegates

/**
 * 标准委托-Observable
 * @author wangzhichao
 * @date 2019/09/08
 */
class User(name: String) {
    var name: String by Delegates.observable(name) {property, oldValue, newValue ->
        println("Property $property.name changed from $oldValue to $newValue")
    }
}

fun main(args: Array<String>) {
    val user = User("wzc")
    user.name = "wzj"
    user.name = "wcg"
    user.name = "wcx"
}

/**
 * 总结：
 */
