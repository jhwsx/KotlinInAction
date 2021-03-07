package com.kotlin.inaction.chapter_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * 不使用委托属性，实现当一个对象的属性更改时通知监听器。
 *
 * @author wzc
 * @date 2019/4/15
 */
// 这里是存储了 PropertyChangeSupport 的实例，并监听属性的修改。
open class PropertyChangeAware {
    // PropertyChangeSupport 是 Java 中定义的类，这是一个实用工具类，支持绑定 (bound) 属性的 bean 可以使用该类。
    // 可以使用此类的实例作为 bean 的成员字段，并将各种工作委托给它。 此类是可序列化的。
    // 在对它进行序列化时，它将保存（并恢复）本身可序列化的所有侦听器。在序列化期间，将跳过所有不可序列化的侦听器
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
            // 最终调用的是 firePropertyChange(PropertyChangeEvent event) 方法
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            // 最终调用的是 firePropertyChange(PropertyChangeEvent event) 方法
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