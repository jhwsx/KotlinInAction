package com.kotlin.inaction.reference.classes_and_objects.`14_delegation`


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print()
}

/**
 * 总结：
 * 1，Derived 类的超类列表中的 by 语句表明 b 将会被存储在 Derived 对象的内部，
 * 并且在 Derived 类内部编译器会产生 Base 的所有的方法并 forward to b。
 */