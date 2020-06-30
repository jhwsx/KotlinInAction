package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
class Outer {
    inner class Inner {
        private val a = 5
        private fun privateMethod() {
            println("privateMethod()")
        }
        fun getOuterReference(): Outer = this@Outer

        fun getInnerReference(): Inner = this
    }

    class StaticInner {
        private val a = 6
        private fun privateMethod() {
            println("privateMethod()")
        }
    }
}

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    // println(inner.a) // 不能获取到 a：因为它在 Inner 类里面是私有的
    // inner.privateMethod() // 不能获取到 privateMethod：因为它在 Inner 类里面是私有的
    println(inner.getOuterReference())
    println(inner.getInnerReference())
    val staticInner = Outer.StaticInner()
    // println(staticInner.a) // 不能获取到 a：因为它在 StaticInner 类里面是私有的
    // staticInner.privateMethod()  // 不能获取到 privateMethod：因为它在 StaticInner 类里面是私有的
}
/**
 * 总结：
 * 1，在 kotlin 中引用外部类实例的语法与java不同。
 * 需要使用this@Outer从Inner类去访问Outer类。在java
 * 中的写法是Outer.this。
 * 代码在 {com.kotlin.inaction.chapter_4.JavaOuterClass}
 */