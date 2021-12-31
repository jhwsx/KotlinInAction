package com.kotlin.inaction.chapter_3

import kotlin.math.pow

/**
 * top level 扩展函数
 * 参考：
 * https://mp.weixin.qq.com/s/NKymd7Suc52j4E5nhg5MSQ
 * https://mp.weixin.qq.com/s/CSlQHKZRdhAChbPrXsKLXA - 会写「18.dp」只是个入门——Kotlin 的扩展函数和属性（Extension Functions/Properties）
 * @author wzc
 * @date 2019/1/12
 */
fun String.lastChar(): Char = this.get(this.length - 1) // this 是可以省略的

fun String.firstChar(): Char = get(0)

fun String.printSelf() {
    print(this)
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun lastChar2(str: String): Char {
    return str[str.length - 1]
}

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".firstChar())
    "Kotlin".printSelf()
    println()

    println(2f.pow(4))
    val list = mutableListOf(1, 2, 3)
    println("before swap: $list")
    list.swap(0,1)
    println("after swap: $list")

    // 当扩展函数和成员函数同名时，总是会调用成员函数。
    class Example {
        fun printFunctionType() {
            println("Class method")
        }
    }

    fun Example.printFunctionType() {
        println("Extension function")
    }

    Example().printFunctionType()

    fun Any?.tooString(): String {
        if (this == null) return "null"
        return toString()
    }

    println(null.tooString())
    println(Example().tooString())
}

/**
 * 总结：
 * 1，kotlin 中使用扩展函数，就是一个类的成员函数，不过是定义在类的外边；
 * 2，扩展函数的具体做法：把要扩展的类或者接口的名称，放到即将添加的函数前面，
 * 这个类的名称被称为接收者类型；用来调用这个扩展函数的那个对象，叫做接收者对象
 * fun String.lastChar(): Char = this.get(this.length - 1)
 * 这里 String 是接收者类型，指的就是被扩展的类型 "Kotlin" 是接收者对象
 * 3，在扩展函数中，可以直接访问被扩展的类的其他方法和属性；但是，不可以访问私有
 * 的或者是受保护的成员
 */
