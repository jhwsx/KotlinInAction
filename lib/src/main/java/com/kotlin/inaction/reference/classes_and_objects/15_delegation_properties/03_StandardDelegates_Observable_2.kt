package com.kotlin.inaction.reference.classes_and_objects

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 标准委托-Observable
 * @author wangzhichao
 * @date 2019/09/08
 */
class User1(name: String, age: Int) {
    var name: String by Delegates.vetoable(name) { property: KProperty<*>, oldValue: String, newValue: String ->
        println("Property ${property.name} is going to change from $oldValue to $newValue, but i veto it.")
        false // 返回为 false，就是否决它
    }
    var age: Int by Delegates.vetoable(age) { property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("Property ${property.name} is going to change from $oldValue to $newValue, and i said ok.")
        true // 返回为 true，不会否决
    }
}

fun main(args: Array<String>) {
    val user = User1("wzc", 18)
    user.name = "wzj"
    user.name = "wcg"
    user.name = "wcx"
    println(user.name)

    user.age = 19
    user.age = 21
    user.age = 22
    println(user.age)
}

/*
打印结果：
Property name is going to change from wzc to wzj, but i veto it.
Property name is going to change from wzc to wcg, but i veto it.
Property name is going to change from wzc to wcx, but i veto it.
wzc
Property age is going to change from 18 to 19, and i said ok.
Property age is going to change from 19 to 21, and i said ok.
Property age is going to change from 21 to 22, and i said ok.
22

*/
/**
 * 总结：
 * 1, 使用 vetoable() 如果打算拦截一个赋值并且否决这个赋值。
 */
