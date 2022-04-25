package com.kotlin.inaction.chapter_10

/**
 *
 * @author wangzhichao
 * @since 2022/4/19
 */
// 没有任何参数的注解
annotation class JsonExclude1
// 拥有参数的注解，在类的主构造方法中声明这些参数
// val 关键字是强制的
annotation class JsonName1(val name: String)