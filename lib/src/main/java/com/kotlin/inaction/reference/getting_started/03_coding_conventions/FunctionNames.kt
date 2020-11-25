package com.kotlin.inaction.reference.getting_started.`03_coding_conventions`

/**
 * @author wangzhichao
 * @date 2019/09/17
 */
val USER_FIELD_NAME = "UserName"
const val MAX_COUNT = 8
abstract class Foo {
    abstract fun foo()
}

class FooImpl : Foo() {
    override fun foo() {
        println("foo()")
    }
}

fun newInstance(): Foo {
    return FooImpl()
}

fun main(args: Array<String>) {
    newInstance()
}