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

open class Animal44 : Animal3()

open class Animal55 : Animal44()

class Herd3<out T : Animal3>(vararg animals: T) {
    private val list = animals.asList()
    val size: Int get() = list.size
    operator fun get(i: Int) : T {
        return list[i]
    }

}

fun main(args: Array<String>) {
    // 它的类型实参实际上是最高的那个类型
    val herd: Herd3<Animal3> = Herd3(Animal3(), Animal44(), Animal55(), Animal55(), Animal44())
    val first: Animal3 = herd[0]
    val herd2: Herd3<Animal44> = Herd3(Animal44(), Animal55(), Animal55(), Animal44())
}

/**
 * 总结：
 * 1, 这个例子展示了构造方法的参数既不在 in 位置，也不在 out 位置。
 * 因此，即使类型参数声明为 out， 仍然可以在构造方法参数的声明中使用它。
 * 为什么这样设计呢？
 * 因为构造方法不是在实例创建之后还能调用的方法，没有潜在的危险。
 */





