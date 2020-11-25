package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable2 {
    // const val PI = 3.1415926 // 不可以声明常量
    fun click()
    fun showOff() = println("I'm clickable!") // 默认实现的方法
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button2 : Clickable2, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }

    companion object {
        const val PI = 3.1415926
    }
}

fun main(args: Array<String>) {
    val button = Button2()
    button.showOff()
    button.setFocus(true)
    button.click()
}

/**
 * 总结：
 * 1, 在 Kotlin 中，接口的方法可以有一个默认实现。但是与 Java8 不同的是，Java8 需要你在这样的实现上标注
 * default 关键字，对于这样的方法，Kotlin 没有特殊的注解：只需要提供一个方法体。
 * 2，在 kotlin 中，类实现的多个接口中都有某个方法的默认实现,那么类必须显式地实现这个方法. 在 Java 中，也会
 * 出现类似的问题。
 * 3，在实现方法中，可以再调用父类的实现，kotlin 使用super<父类名>.method()，
 * java 使用父类名.super.method().
 * 4, 在 Java 类中实现 Kotlin 的接口，必须为所有的方法定义自己的实现。
 */