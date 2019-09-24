package com.kotlin.inaction.reference.classes_and_objects.visibilitymodifiers.pkg

/**
 * @author wangzhichao
 * @date 2019/09/24
 */
// protected val x : Int = 5 // protected 不用于顶层属性

private val y: Int = 5 // private 修饰的，在所在的文件外部无法访问
val z: Int = 6

fun main(args: Array<String>) {
    println(y)
}
