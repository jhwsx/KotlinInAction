package com.kotlin.inaction.reference.classes_and_objects

interface Base2 {
    val message: String
    fun print()
}

class Base2Impl(val x: Int) : Base2 {
    override val message: String = "Base2Impl: x = $x"

    override fun print() {
        println(message)
    }
}

class Derived2(val b: Base2): Base2 by b {
    override val message: String
        get() = "Message of Derived"
}

fun main(args: Array<String>) {
    val b = Base2Impl(10)
    val d = Derived2(b)
    d.print()
    println(d.message)
}

