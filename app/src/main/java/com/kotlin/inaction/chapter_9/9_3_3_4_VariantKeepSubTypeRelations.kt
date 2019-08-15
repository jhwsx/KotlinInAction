package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Animal2 {
    fun feed() {
        println("feed()")
    }
}

class Herd2<out T : Animal2> {
    private val list = arrayListOf<T>()
    val size: Int get() = list.size
    operator fun get(i: Int) : T {
        return list[i]
    }

    fun add(t: @UnsafeVariance T) {
        list.add(t)
    }
}

fun feedAll2(animals: Herd2<Animal2>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat2: Animal2() {
    fun cleanLitter() {
        println("cleanLitter()")
    }
}

fun takeCareOfCats2(cats: Herd2<Cat2>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll2(cats) // 在 Herd1 的类型参数前加上 out 后，此行编译通过
}

fun main(args: Array<String>) {
    val herd = Herd2<Cat2>()
    herd.add(Cat2())
    herd.add(Cat2())
    herd.add(Cat2())
    herd.add(Cat2())
    herd.add(Cat2())
    takeCareOfCats2(herd)
}

/**
 * 总结：
 * 1，这个例子仅仅是使用 @UnsafeVariance 压制，来通过编译而已。
 */





