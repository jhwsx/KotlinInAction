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
    p.addPropertyChangeListener(
        PropertyChangeListener { event ->
            "Property ${event.propertyName} changed " +
                    "from ${event.oldValue} to ${event.newValue}"
        })
    p.age = 33
    p.salary = 1500
}