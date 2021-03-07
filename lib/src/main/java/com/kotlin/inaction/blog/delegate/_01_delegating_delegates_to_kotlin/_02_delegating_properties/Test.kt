package com.kotlin.inaction.blog.delegate._01_delegating_delegates_to_kotlin._02_delegating_properties

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 委托属性中，委托负责处理对属性的 get 和 set 方法的调用
 *
 * This can be extremely useful if you need to reuse the getter/setter logic across other objects and lets you easily extend functionality beyond simple backing fields.
 * @author wangzhichao
 * @since 2021/3/7
 */
class Person1(var name: String, var lastname: String)

class Person2(name: String, var lastname: String) {
    var name: String = name
        set(value) {
            field = value.toLowerCase().capitalize()
            updateCount++
        }
    var updateCount = 0
}

class Person3(name: String, lastname: String) {
    var name: String = name
        set(value) {
            field = value.toLowerCase().capitalize()
            updateCount++
        }

    var lastname: String = lastname
        set(value) {
            field = value.toLowerCase().capitalize()
            updateCount++
        }
    var updateCount = 0
}

class Person4(name: String, lastname: String) {
    var name: String by FormatDelegate()
    var lastname: String by FormatDelegate()
    var updateCount = 0
}

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    /***
     * @param thisRef 代表了包含属性的对象
     * @param property 表示属性本身，可以用于获取被委托的属性的元信息
     * @param value 新的值
     */
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        if (thisRef is Person4) {
            thisRef.updateCount++
        }
        formattedString = value.toLowerCase().capitalize()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

}

fun main() {
    println("Person2: ")
    val person2 = Person2("john", "Bush")
    person2.name = "peter"
    person2.name = "lily"
    println("${person2.name}, ${person2.updateCount}")

    println("Person3: ")
    val person3 = Person3("john", "bush")
    person3.name = "peter"
    person3.lastname = "bush"
    println("${person3.name}, ${person3.lastname}, ${person3.updateCount}")

    println("Person4: ")
    val person4 = Person4("john", "bush")
    person4.name = "peter"
    person4.lastname = "wang"
    println("${person4.name}, ${person4.lastname}, ${person4.updateCount}")



}

