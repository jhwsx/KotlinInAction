package com.kotlin.inaction.chapter_7

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *
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

class Person002(name: String, lastname: String) {
    var name: String by FormatDelegate()
    var lastname: String by FormatDelegate()
    var updateCount = 0
}

class FormatDelegate : ReadWriteProperty<Any?, String> {

    private var formattedString = ""

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
    val person002 = Person002("john", "jobs")
    person002.name = "john"
    println(person002.name)
}


