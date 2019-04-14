package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
data class NameComponents1(val name: String, val extension: String)

fun splitFileName1(fullName: String): NameComponents1 {
    val (name, extension) = fullName.split(".", limit = 2)
    return NameComponents1(name, extension)

}

fun main(args: Array<String>) {
    val (name, extension) = splitFileName1("helloworld.kt")
    println(name)
    println(extension)
}

/**
 * 总结：
 * 1, 进一步改进上面的例子，使用解构声明来处理集合。
 * 2，
 */