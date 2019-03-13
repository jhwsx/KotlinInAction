package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
fun shoutAt(man: Man) {
    println(man.name.toUpperCase() + ", GO OUT!!!")
}

fun main(args: Array<String>) {
//    shoutAt(Man(null)) // 编译报错
    shoutAt(Man("John"))
    val man = Man("wzc")
    val name: String = man.name
    val name1: String? = man.name
}