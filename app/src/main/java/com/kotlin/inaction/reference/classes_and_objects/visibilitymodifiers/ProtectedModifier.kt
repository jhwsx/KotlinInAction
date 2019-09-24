package com.kotlin.inaction.reference.classes_and_objects.visibilitymodifiers

/**
 * @author wangzhichao
 * @date 2019/09/24
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e = 5
    }

}

class Sub : Outer() {
    override val b: Int = 5

    fun foo() {
        // println(a)
        println(b)
        println(c)
        println(d)
        val nested = Nested()
        println(nested.e)

    }
}


class Unrelated(o: Outer) {
    init {
        // println(o.a) // 私有成员，当然不可以获取
        // println(o.b) // protected 成员，但是这里访问不到它，因为这里不是子类

    }
}
fun main(args: Array<String>) {
    val sub = Sub()
    sub.foo()
}

/**
 * 总结：
 * 1，private 修饰的变量包括类中可见 + 文件中可见
 * 前者是修饰的类里的变量，后者是说修饰顶层属性
 * 1，protected 的含义：private + 子类可见
 */
