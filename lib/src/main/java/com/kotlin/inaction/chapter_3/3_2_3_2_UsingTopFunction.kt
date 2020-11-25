package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(joinToString4(list, separator = ", ", postfix = "}", prefix = "{"))
    println(joinToString5(list, separator = "; ", postfix = ")", prefix = "("))
}

/**
 * 总结：
 * 1，在 Kotlin 中，可以把函数直接放到代码文件的顶层，不用从属于任何类；
 * 2，所有顶层函数都会编译为类的静态函数，注意是静态函数；
 * 3，可以改变包含Kotlin 顶层函数的生成的类的名称，需要为这个类添加@file:JvmName的注解，
 * 这个注解的位置是文件的开头，包名的前面
 * 4, 也可以使用顶层属性，同样也会被编译成静态的
 */