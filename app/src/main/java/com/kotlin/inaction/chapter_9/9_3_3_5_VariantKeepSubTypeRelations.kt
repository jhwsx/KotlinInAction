package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Animal3 {
    fun feed() {
        println("feed()")
    }
}

class Herd3<out T : Animal3>(vararg animals: T) {
    private val list = animals.asList()
    val size: Int get() = list.size
    operator fun get(i: Int) : T {
        return list[i]
    }

}

fun feedAll3(animals: Herd3<Animal3>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat3: Animal3() {
    fun cleanLitter() {
        println("cleanLitter()")
    }
}

fun takeCareOfCats3(cats: Herd3<Cat3>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll3(cats) // 在 Herd1 的类型参数前加上 out 后，此行编译通过
}

fun main(args: Array<String>) {
    val herd = Herd3<Cat3>(Cat3(), Cat3(), Cat3())
    takeCareOfCats3(herd)
}

/**
 * 总结：
 * 1, 这个例子展示了构造方法的参数既不在 in 位置，也不在 out 位置。
 * 即使类型参数声明为 out， 仍然可以在构造方法参数的声明中使用它。
 */





