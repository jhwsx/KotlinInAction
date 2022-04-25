package com.kotlin.inaction.chapter_10

/**
 * 可以应用到注解类上的注解被称作元注解
 * @author wangzhichao
 * @since 2022/4/19
 */
// 没有加 @Target 注解，这个注解可以使用到所有的地方
annotation class JsonExclude2

// 加上 @Target(AnnotationTarget.PROPERTY) 注解，只可以用在属性上
@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude3

// 声明自己的元注解，使用 ANNOTATION_CLASS 作为目标
@Target(AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME) // 这是默认的保留行为，与 Java 不同，Java 的默认保留行为是 class。
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding

