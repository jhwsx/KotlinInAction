package com.kotlin.inaction.reference.classes_and_objects.`15_delegation_properties`

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
//        get()= field
//        set(value) {field = value}

}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef")

    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p) // 读取e.p 会调用 Delegate 类的 getValue() 方法
    e.p = "you're welcome." // 给 p 设置值会调用 Delegate 类的 setValue() 方法
}

/*
打印结果：
com.kotlin.inaction.reference.classes_and_objects.15_delegation_properties.Example@3af49f1c, thank you for delegating 'p' to me!
you're welcome. has been assigned to 'p' in com.kotlin.inaction.reference.classes_and_objects.15_delegation_properties.Example@3af49f1c
*/
/**
 * 总结：
 * 1，委托属性的语法：val/var <property name>: <Type> by <expression>
 *  by 后面的 expression 就是 delegate.
 *  委托属性的 get() 或者 set() 方法会被委托给委托类的 getValue() 或者 setValue() 方法。
 * 2，从打印结果可以知道：getValue，setValue 方法的第一个参数 thisRef 就是 Example 对象，就是 this.
 * 3，这里有一个 KProperty 的参数，它是 property 本身的描述
 */