package com.kotlin.inaction.chapter_9

/**
 * 定义一个不变型的类似集合的类
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Animal {
    fun feed() {
        println("feed()")
    }
}

class Herd<T : Animal> {
    private val list = arrayListOf<T>()
    val size: Int get() = list.size
    operator fun get(i: Int): T {
        return list[i]
    }

    fun add(t: T) {
        list.add(t)
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat : Animal() {
    fun cleanLitter() {
        println("cleanLitter()")
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
//    feedAll(cats) // 编译报错，类型不匹配 Type mismatch. Required: Herd<Animal> Found: Herd<Cat>
}

fun takeCareOfAnimals(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
    feedAll(animals)
}

fun main(args: Array<String>) {
    val herd = Herd<Cat>()
    herd.add(Cat())
    herd.add(Cat())
    herd.add(Cat())
    herd.add(Cat())
    herd.add(Cat())
    takeCareOfCats(herd)
}

/**
 * 总结：
 * 1，解决办法看下个例子: 第 43 行编译报错.
 * Herd 类有一个类似 List 的 API, 并且不允许它的调用者添加和改变畜群中的动物.
 */



