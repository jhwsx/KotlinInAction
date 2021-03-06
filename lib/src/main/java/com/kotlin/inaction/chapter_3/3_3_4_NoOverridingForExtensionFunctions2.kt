package com.kotlin.inaction.chapter_3

import com.kotlin.inaction.chapter_3.extension.show
import com.kotlin.inaction.chapter_3.extension1.show as show1

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
fun View.showOff1() = println("I'm a View")
fun Button.showOff1() = println("I'm a Button")
fun View.showOff() = println("I am a View")

class A {
    fun show() {
        println("I'm a member method：show()")
    }
}

class B {

}

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff1()
    view.showOff()

    // 验证 如果一个类的成员函数和扩展函数有相同的签名，成员函数往往会被优先使用
    val a = A()
    a.show()

    val b = B()
    b.show()
    b.show1()
}

/**
 * 总结：
 * 1，扩展函数是不可以重写的，这是因为扩展函数是静态的；
 * 2，扩展函数并不是类的一部分，它是声明在类之外的；
 * 3，给基类和子类分别定义一个同名的扩展函数，当函数被调用时，调用哪一个是由该变量的
 * 静态类型所决定的，而不是这个变量的运行时类型;
 * 4, 如果一个类的成员函数和扩展函数有相同的签名，成员函数往往会被优先使用。
 * 当在扩展 API 类的时候，如果添加一个和已有的扩展函数同名的成员函数，那么对应类定义的消费者将会重新编译
 * 代码，开始指向新的成员函数。
 */