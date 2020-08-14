package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/9
 */
fun main(args: Array<String>) {
    val p = Person("Dmitry", 35)
    val personAgeFunction = Person ::age
    println(personAgeFunction(p))
    println(personAgeFunction.invoke(p)) // 需要传递一个参数

    val dmitrysAgeFunction = p::age
    println(dmitrysAgeFunction())
    println(dmitrysAgeFunction.invoke()) // 不需要传递参数

    val p1 = Person("wzc", 31)
    val wzcAgeFunction = p1::age
    println(wzcAgeFunction())
}
/**
 * 总结：
 * 1，在 kotlin 1.0 中，当接收一个类的方法或属性引用时，始终需要提供一个该类的实例来调用这个引用；
 * 2，在 kotlin 1.1 中，支持绑定成员引用，允许使用成员引用语法捕捉特定实例对象上的方法引用。
 */