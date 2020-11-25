package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/7/31
 */
class Dog(_name: String) {
    val name = _name
    fun show() {
        // println(_name) // 编译错误：不能引用到 _name
    }
}

class Cat(_name: String) {
    val name: String

    init {
        name = _name
    }
}

class Fish(val name: String) {
    fun show() {
        println(name)
    }
}


