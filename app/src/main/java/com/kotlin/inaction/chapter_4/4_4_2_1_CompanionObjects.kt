package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/27
 */
class A {

    companion object {
        fun bar() {
            println("Companion object called")
        }

        fun boo() {
            A().hhhh()
        }
    }

    private fun hhhh() {
        println("method hhhh()")
    }
}

fun main(args: Array<String>) {
    A.bar()
}

/**
 * 总结：
 * 1，伴生对象：
 * 为什么伴生对象呢？
 * a. kotlin 中的类不能拥有静态成员，也就是说不能把 java 中的 static 关键字并不是 kotlin 语言的一部分。
 * b. 但是，kotlin 有替代的法宝：kotlin 有依赖包级别函数和对象声明；多数情况下，顶层函数更好用。
 * c. 顶层函数有个缺点：它不能访问类的 private 成员;
 * d. 如果需要写一个在没有类实例的情况下调用但是需要访问类内部的函数，可以将其写成那个类中的对象声明的成员。
 * 在类中定义的对象之一可以使用一个特殊的关键字来标记：companion。这样就实现了直接通过容器类名称来访问这个对象
 * 的方法和属性的能力，不再需要显式地指明对象的名称。
 * e. 伴生对象可以访问类中的所有 private 成员，包括 private 构造方法
 */
