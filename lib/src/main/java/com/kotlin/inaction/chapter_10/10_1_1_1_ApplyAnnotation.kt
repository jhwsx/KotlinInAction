package com.kotlin.inaction.chapter_10

import kotlin.reflect.KClass

/**
 *
 * @author wangzhichao
 * @since 2022/4/18
 */

class MyList {
    // ReplaceWith 也是一个注解
    @Deprecated(
        message = "Use removeAt(index) instead.",
        replaceWith = ReplaceWith("removeAt(index)")
    )
    fun remove(index: Int) {
    }

    fun removeAt(index: Int) {}
}

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.LOCAL_VARIABLE,AnnotationTarget.PROPERTY_GETTER,)
@Retention(AnnotationRetention.SOURCE)
annotation class MyAnnotation(
    val clazz: KClass<*>,
    val anotherAnnotation: AnotherAnnotation = AnotherAnnotation(""),
    val path: Array<String> = [],
    vararg val names: String,
    val timeout: Long = 0L
)

annotation class AnotherAnnotation(val message: String)

val timeoutValue = 100L
const val TEST_TIMEOUT = 100L
fun main() {
    val myList = MyList()
    // 可以提示应该使用哪个函数来代替它
    // 按 Alt + Enter，可以自动地快速修正
    myList.remove(0)

    @MyAnnotation(
        clazz = String::class,
        anotherAnnotation = AnotherAnnotation("hello"),
        path = ["a", "b", "c"],
        names = ["zhangsan", "lisi"],
        // 注解实参需要在编译器是已知的。要把属性当做注解实参使用，需要这个属性是编译期常量。
        // timeout = timeoutValue // Only 'const val' can be used in constant expressions
        // timeout = 100L // OK
        timeout = TEST_TIMEOUT
    )
    val str: String
}