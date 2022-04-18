package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/21
 */
interface Consumer<in T> {
    fun consume(item: T)
}

class Eater<in T> : Consumer<T> {
    override fun consume(item: T) {
        println("consume: $item")
    }
}

open class Fruit

open class Apple: Fruit()

class Hongfushi: Apple()

fun main(args: Array<String>) {
    val c: Consumer<Apple> = Eater<Fruit>()
//     c.consume(Fruit()) // 编译报错
    // 只能接收 Apple 类型及其子类型
    c.consume(Apple()) // OK
    c.consume(Hongfushi()) // OK
}