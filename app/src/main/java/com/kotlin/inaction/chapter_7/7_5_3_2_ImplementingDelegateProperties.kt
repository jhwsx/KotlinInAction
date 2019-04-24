package com.kotlin.inaction.chapter_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 *
 * @author wzc
 * @date 2019/4/24
 */

open class PropertyChangeAware1 {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ObservableProperty(
    val propName: String, var propValue: Int,
    val changeSupport: PropertyChangeSupport
) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class Person9(val name: String, age: Int, salary: Int) : PropertyChangeAware1() {
    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) {_age.setValue(value)}

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) {_salary.setValue(value)}
}
fun main(args: Array<String>) {
    val p = Person9("wzc", 31, 1000)
    val listener = PropertyChangeListener { event ->
        println(
            "Property ${event.propertyName} changed " +
                    "from ${event.oldValue} to ${event.newValue}"
        )
    }
    p.addPropertyChangeListener(listener)
    p.age = 11
    p.salary = 1600
    p.removePropertyChangeListener(listener)
}

/**
 * 总结：
 * 1，使用辅助类来实现属性变化的通知：这里依然有不少样板代码，创建 ObservableProperty 实例，并把 getter 和 setter 委托给它。
 */