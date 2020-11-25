package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/11
 */
class Book(val title: String, val authors: List<String>)
fun main(args: Array<String>) {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )

    println(books.flatMap { it.authors }.toSet()) // toSet 的作用是去重

}
