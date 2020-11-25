package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
interface Clickable3 {
    fun click()
    fun showOff() = println("I'm clickable")
}

open class RichButton : Clickable3 {
    val width: Int = 5

    open val height: Int = 5

    open var size: Int = 0

    val a: Boolean // 这个属性是 final 的，在子类中不可以重写它
        get() = true

    fun disable() {} // 这个方法是 final 的，在子类中不可以重写它

    open val b: Boolean // 这个属性是 open 的，在子类中可以重写它
        get() = false

    open fun enable() { // 这个方法是 open 的，在子类中可以重写它

    }
    open fun animate() {}

    override fun click() {}
}

open class SubRichButton : RichButton() {

    override val height: Int
        get() = super.height

    override var size: Int
        get() = super.size
        set(value) {
        }
    override val b: Boolean
        get() = super.b

    final override fun enable() { // 有 final 显式地修饰，所以 enable() 方法不准子类重写了
        super.enable()
    }

    override fun animate() {
        super.animate()
    }

    override fun click() {
        super.click()
    }
}

class SubSubRichButton : SubRichButton() {
    // 不能重写 enable 方法
}

/**
 * 总结：
 * 1，所有没有特别需要在子类中被重写的类和方法应该被显式地标注为final；
 * 2，java中的类和方法默认是open的，而kotlin中默认都是final的；
 * 3，open 修饰符修饰的类，其他类可以继承它；
 * 4，open 修饰符修饰的方法或属性，在子类中可以重写它；
 * 需要注意的是，对于属性来说，重写的是它的 getter 或者 setter 方法。
 * 5，override 修饰符修饰的方法，也是 open的；
 * 6，本类覆写的方法，不再希望子类覆写，可以在 override 前再加 final 修饰符。
 */