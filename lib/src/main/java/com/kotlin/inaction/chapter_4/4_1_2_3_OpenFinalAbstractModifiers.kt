package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/16
 */
abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {}

    fun animateTwice() {}
}

open class AnimatedImpl : Animated {
    constructor() : super()

    override fun animate() {

    }
}

open class AnimatedImpl2 : Animated() {
    override fun animate() {
    }
}

fun main() {
    // val animated = Animated() // 编译报错：不能实例化一个抽象类。
}

/**
 * 总结：
 * 1，abstract 修饰符修饰的类是抽象类，不能被实例化；
 * 2，abstract 修饰符修饰的方法是抽象方法，必须被子类重写，抽象方法始终是open的；
 * 3，抽象类中的非抽象函数并不是默认open的，但是可以标注为open的；
 */
