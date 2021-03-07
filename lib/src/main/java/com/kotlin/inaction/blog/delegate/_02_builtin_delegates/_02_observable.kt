package com.kotlin.inaction.blog.delegate._02_builtin_delegates

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Person1 {
    var address: String by Delegates.observable("not entered yet!") {
        property: KProperty<*>, oldValue: String, newValue: String ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}

fun main() {
    val person1 = Person1()
    person1.address = "Shanghai"
    person1.address = "Beijing"
}