package com.kotlin.inaction.chapter_7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

/**
 *
 * @author wzc
 * @date 2019/4/24
 */

open class PropertyChangeAware2 {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ObservableProperty1(
        // val propName: String, // 不需要从这里拿到属性名字了，所以去掉。
        var propValue: Int,
        val changeSupport: PropertyChangeSupport
) {
//    fun getValue(): Int = propValue
//    fun setValue(newValue: Int) {
//        val oldValue = propValue
//        propValue = newValue
//        changeSupport.firePropertyChange(propName, oldValue, newValue)
//    }
    /**
     * 按照约定的需要，getValue 函数标记了 operator
     *
     * @param p 用于接收属性的实例，就是说，属性所归属的那个实例
     * @param prop 用于表示属性本身，类型为 KProperty 类型。可以使用 KProperty.name 的方式来访问到该属性的名称
     * @return
     */
    operator fun getValue(p: Person10, prop: KProperty<*>): Int = propValue

    /**
     * 按照约定的需要，setValue 函数标记了 operator
     *
     * @param p 用于接收属性的实例，就是说，属性所归属的那个实例
     * @param prop 用于表示属性本身，类型为 KProperty 类型。可以使用 KProperty.name 的方式来访问到该属性的名称
     * @param newValue 新的值
     */
    operator fun setValue(p: Person10, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class Person10(val name: String, age: Int, salary: Int) : PropertyChangeAware2() {
    //    val _age = ObservableProperty("age", age, changeSupport)
//    var age: Int
//        get() = _age.getValue()
//        set(value) {
//            _age.setValue(value)
//        }
//
//    val _salary = ObservableProperty("salary", salary, changeSupport)
//    var salary: Int
//        get() = _salary.getValue()
//        set(value) {
//            _salary.setValue(value)
//        }
    var age: Int by ObservableProperty1(age, changeSupport) // by 关键字右边的对象被称为委托
    var salary: Int by ObservableProperty1(salary, changeSupport)
}

fun main(args: Array<String>) {
    val p = Person10("wzc", 31, 1000)
    val listener = PropertyChangeListener { event ->
        println(
                "Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}"
        )
    }
    p.addPropertyChangeListener(listener)
    p.age = 12
    p.salary = 1800
    p.removePropertyChangeListener(listener)
}

/**
 * 总结：
 * 1, by 关键字右边的对象被称为委托。
 */