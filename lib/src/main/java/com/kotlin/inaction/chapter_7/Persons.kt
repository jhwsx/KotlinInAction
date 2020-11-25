package com.kotlin.inaction.chapter_7

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * https://medium.com/androiddevelopers/delegating-delegates-to-kotlin-ee0a0b21c52b
 *
 * @author wangzhichao
 * @date 20-11-13
 */
// 没有使用属性代理的例子
// 缺点：存在重复的代码
class Person001(name: String, lastname: String) {
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

/**
 * 使用了属性代理
 * 反编译的代码里使用 KProperty[] 数组来存储代理属性。
 */
class Person002(name: String, lastname: String) {
    var name: String by FormatDelegate()
    var lastname: String by FormatDelegate()
    var updateCount = 0
}

class FormatDelegate : ReadWriteProperty<Any?, String> {

    private var formattedString = ""

    /**
     * thisRef：发起委托的对象，它包含了一些属性
     * property：可以用于获取委托的属性的 meta data。
     */
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        if (thisRef is Person002) {
            thisRef.updateCount++
        }
        formattedString = value.toLowerCase().capitalize()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }
}

fun main() {
    println("===========use Person001===========")
    val person001 = Person001("john", "jobs")
    person001.name = "john"
    println(person001.name)
    person001.name = "peter"
    println(person001.name)
    println(person001.updateCount)
    person001.lastname = "bush"
    println(person001.lastname)
    person001.lastname = "obama"
    println(person001.lastname)
    println(person001.updateCount)
    println("===========use Person002===========")
    val person002 = Person002("john", "jobs")
    person002.name = "john"
    println(person002.name)
    person002.name = "peter"
    println(person002.name)
    println(person002.updateCount)
    person002.lastname = "bush"
    println(person002.lastname)
    person002.lastname = "obama"
    println(person002.lastname)
    println(person002.updateCount)
}

class Person003(name: String, lastname: String) {
    val fullname: String by lazy { name + lastname }
}


