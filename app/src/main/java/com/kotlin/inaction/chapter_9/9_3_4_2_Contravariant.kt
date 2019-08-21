package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/21
 */
interface Consumer<in T> {
    fun add(item: T)
}

class Bowl<T> : Consumer<T> {
    private val items = mutableListOf<T>()
    override fun add(item: T) {
        items.add(item)
    }
}

open class Fruit

class Apple: Fruit()

fun main(args: Array<String>) {
    val c: Consumer<Apple> = Bowl<Fruit>()
//    c.add(Fruit() as Apple) // Exception in thread "main" java.lang.ClassCastException: com.kotlin.inaction.chapter_9.Fruit cannot be cast to com.kotlin.inaction.chapter_9.Apple
//    at com.kotlin.inaction.chapter_9._9_3_4_2_ContravariantKt.main(9_3_4_2_Contravariant.kt:25)
    c.add(Apple())
    println(c)
}