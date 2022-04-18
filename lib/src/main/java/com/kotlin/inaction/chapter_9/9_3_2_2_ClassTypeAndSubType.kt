package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/13
 */
val xy: List<Int> = listOf()
val xz: List<String?> = listOf()
val xa: List<Boolean> = listOf()
val xb: List<String> = listOf()
val xc: List<List<String>> = listOf()
val xd: List<List<List<String>>> = listOf()

/**
 * 总结：
 * 1，泛型类与泛型类型？
 * 对于泛型类，类的名称不可以直接当做类型使用，必须要用一个作为类型实参的具体类型替换泛型类的类型形参。
 * 如 List 不是一个类型，它是一个类。
 * 每一个泛型类都可能生成潜在的无限数量的类型
 * List 是一个泛型类, 但它可以对应很多种类型: List<Int>, List<String> ...
 */
