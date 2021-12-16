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

/*
打印：
Init block
Second constructor
 */
/**
 * 总结：
 * 1， Constructors 类没有主构造器，但是在从构造器的第一条语句仍会隐含地委托给主构造器。
 */
