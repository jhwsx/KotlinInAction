package com.kotlin.inaction.chapter_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 *
 * @author wzc
 * @date 2019/4/15
 */
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Person8(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}

fun main(args: Array<String>) {
    val p = Person8("wzc", 31, 1000)
    val listener = PropertyChangeListener { event ->
        println(
            "Property ${event.propertyName} changed " +
                    "from ${event.oldValue} to ${event.newValue}"
        )
    }
    p.addPropertyChangeListener(listener)
    p.age = 33
    p.salary = 1500
    p.removePropertyChangeListener(listener)
}

/**
 * 总结：
 * 1，这里是手工实现属性修改的通知，使用了 java 中通知的标准机制：PropertyChangeSupport 和 PropertyChangeEvent 类。
 * 2，field 是一个标识符，通过它访问属性背后的支持字段。
 * 3，手工实现里的 setter 方法里代码逻辑重复。
 */