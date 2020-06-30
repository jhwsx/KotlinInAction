package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click()= println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}

/**
 * 总结：
 * 1，kotlin 中的接口与 java 中的接口对比：
 * 相同点：都使用 interface 关键字，一个类都可以实现多个接口
 * 不同点：
 *  interface前不用写public，它默认是public 的；
 *  kotlin 中的接口可以包含抽象方法的定义以及非抽象方法的实现，但不能包含任何状态；
 *  kotlin 中在类名后面使用冒号来代替 java 中的 extends 和 implements 关键字；
 *  在java中使用@Override注解，在kotlin中是override修饰符；
 *  在kotlin中使用override修饰符是强制要求的。
 *  kotlin 中的接口不可以声明常量，java 的接口可以声明常量。
 */