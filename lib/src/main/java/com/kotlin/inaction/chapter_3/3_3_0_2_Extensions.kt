package com.kotlin.inaction.chapter_3

/**
 * 成员扩展函数
 * 只能在它所属的类里面通过接收者对象来调用，不可以到外面调用。
 * 这样的好处：不会影响到外界。
 * @author wzc
 * @date 2019/1/12
 */
fun main(args: Array<String>) {
    BaseCaller().call(Base())
    DerivedCaller().call(Base())
    DerivedCaller().call(Derived())
    // 不可以这样调用的
//    BaseCaller().printFunctionInfo()

    MyCaller().call(Base())
    CallerImpl().call(Base())
    CallerImpl().call(Derived())
}

/*
Base extension function in BaseCaller
Base extension function in DerivedCaller
Base extension function in DerivedCaller
printFunctionInfo(base : Base) in MyCaller
printFunctionInfo(base : Base) in CallerImpl
printFunctionInfo(base : Base) in CallerImpl
 */
// ======== 扩展函数的写法 开始 ========
open class Base {}

class Derived : Base() {}

open class BaseCaller {
    // 定义了 Base 类的扩展函数，这样就限定了只有 Base 类对象才可以调用它。
    open fun Base.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }

    open fun Derived.printFunctionInfo() {
        println("Derived extension function in BaseCaller")
    }

    fun call(b: Base) {
        b.printFunctionInfo()
    }
}

class DerivedCaller: BaseCaller() {
    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun Derived.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}
// ======== 扩展函数的写法 结束 ========
// ======== 普通函数的写法 开始 ========
open class MyCaller {
    open fun printFunctionInfo(base : Base) {
        println("printFunctionInfo(base : Base) in MyCaller")
    }

    open fun printFunctionInfo(derived : Derived) {
        println("fun printFunctionInfo(derived : Derived) in MyCaller")
    }

    fun call(b: Base) {
        printFunctionInfo(b)
    }
}

class CallerImpl : MyCaller() {
    override fun printFunctionInfo(base: Base) {
        println("printFunctionInfo(base : Base) in CallerImpl")
    }

    override fun printFunctionInfo(derived: Derived) {
        println("fun printFunctionInfo(derived : Derived) in CallerImpl")
    }
}
// ======== 普通函数的写法 结束 ========