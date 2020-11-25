package com.kotlin.inaction.reference.classes_and_objects.`14_delegation`

interface Base1 {
    fun printMessage()
    fun printMessageLine()
}

class Base1Impl(val x: Int) : Base1 {
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

class Derived1(val b: Base1): Base1 by b {
    override fun printMessage() {
        println("abc")
    }
}

fun main(args: Array<String>) {
    val b = Base1Impl(10)
    Derived1(b).printMessage()
    Derived1(b).printMessageLine()
}

