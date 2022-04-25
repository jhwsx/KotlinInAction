// file 是一个使用点目标
@file:JvmName("AnnotationTargetTest")
package com.kotlin.inaction.chapter_10

/**
 *
 * @author wangzhichao
 * @since 2022/4/18
 */
@Target( AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.BINARY)
annotation class MyAnno1
@Target( AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.BINARY)
annotation class MyAnno2
@Target( AnnotationTarget.FIELD)
@Retention(AnnotationRetention.BINARY)
annotation class MyAnno3

// 使用点目标声明被用来说明要注解的元素。@使用点目标:注解名称，所以下面的 get 和 set 都是使用点目标
@get:MyAnno1 // get 导致注解 @MyAnno1 被应用到属性的 getter 上
@set:MyAnno2 // set 导致注解 @MyAnno2 被应用到属性的 setter 上
@MyAnno3
var str: String = ""

fun main() {

}

fun test(list: List<*>) {
    // Kotlin 允许对任意的表达式应用注解，而不仅仅是类和函数的声明及类型。
    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
}
