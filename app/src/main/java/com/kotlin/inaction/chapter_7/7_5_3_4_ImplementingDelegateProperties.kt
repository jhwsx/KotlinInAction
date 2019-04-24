package com.kotlin.inaction.chapter_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 *
 * @author wzc
 * @date 2019/4/24
 */

open class PropertyChangeAware3 {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}


class Person11(val name: String, age: Int, salary: Int) : PropertyChangeAware3() {

    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main(args: Array<String>) {
    val p = Person11("wzc", 31, 1000)
    val listener = PropertyChangeListener { event ->
        println(
            "Property ${event.propertyName} changed " +
                    "from ${event.oldValue} to ${event.newValue}"
        )
    }
    p.addPropertyChangeListener(listener)
    p.age = 14
    p.salary = 2800
    p.removePropertyChangeListener(listener)
}

/**
 * 总结：
 * 1, by 关键字右边的对象被称为委托。
 */