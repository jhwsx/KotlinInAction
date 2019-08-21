package com.kotlin.inaction.chapter_9

/**
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
    operator fun get(i: Int) : T {
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

class Cat: Animal() {
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
 * 1，解决办法看下个例子
 */



