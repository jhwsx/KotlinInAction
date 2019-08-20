package com.kotlin.inaction.reference.functions_and_lambdas.functions

/**
 * <pre>
 *     author : wangzhichao
 *     e-mail : wangzhichao@adups.com
 *     time   : 2019/08/20
 *     desc   :
 *     version: 1.0
 * </pre>
 */
open class A {
    open fun foo(i: Int = 10) {

    }
}

class B : A() {
//    override fun foo(i: Int = 6) { // An overriding function is not allowed to specify default values for its parameters
//        println(i)
//    }

    override fun foo(i: Int) {
        println(i)
    }
}

fun main() {
    val b = B()
    b.foo()
}