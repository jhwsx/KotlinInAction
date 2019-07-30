package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/7/31
 */
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Second constructor")
    }
}

fun main(args: Array<String>) {
    Constructors(1)
}
