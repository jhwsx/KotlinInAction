package com.kotlin.inaction.chapter_3.extension

import com.kotlin.inaction.chapter_3.lastChar
import com.kotlin.inaction.chapter_3.firstChar as first

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".first())
}

/**
 * 总结：
 * 1，扩展函数是需要导入的，和导入类一样的语法
 * 2，可以使用关键字 as 来修改导入的类或者函数名称，解决命名冲突的问题
 */
