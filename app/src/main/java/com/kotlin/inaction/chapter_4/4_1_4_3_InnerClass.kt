package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
/**
 * 总结：
 * 1，在 kotlin 中引用外部类实例的语法与java不同。
 * 需要使用this@Outer从Inner类去访问Outer类。在java
 * 中的写法是Outer.this。
 * 代码在 {com.kotlin.inaction.chapter_4.JavaOuterClass}
 */