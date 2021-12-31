package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/7
 */
fun main(args: Array<String>) {
    val createPerson = ::Person
    val p = createPerson("Alice", 33)
    println(p)

    val predictate = Person::isAdult
    println(predictate)
}


fun Person.isAdult() = age >= 21

class Extensions {
    fun String.method() {}

    fun call() {
        // 'method' is a member and an extension at the same time. References to such elements are not allowed
        // String::method() // 报错
    }
}
/**
 * 总结：
 * 1，用构造方法引用存储或者延期执行创建类实例的动作；
 * 2，构造方法引用的形式是：在双冒号后指定类名称；
 * 3，引用扩展函数
 */