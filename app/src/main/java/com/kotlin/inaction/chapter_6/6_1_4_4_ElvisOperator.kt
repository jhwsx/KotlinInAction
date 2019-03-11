package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
class Computer(val name: String?, val price: Float)

fun tranverseList(list: List<Computer>): String? {
    for (it in list) {
        val name = it.name ?: return "ng"
        with(it) {
            println("${it.name} ====> ${it.price}")
        }
    }
    return "ok"
}
fun main(args: Array<String>) {
    val list : List<Computer> = listOf(Computer("lenovo",1F),
        Computer("dell", 2f),
        Computer(null, 3f))
    println(tranverseList(list))
}

/**
 * 总结：
 * 1，Elvis 运算符和 return 表达式结合的例子
 */


