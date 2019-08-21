package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Animal1 {
    fun feed() {
        println("feed()")
    }
}

class Herd1<out T : Animal1> {
    private val list = arrayListOf<T>()
    val size: Int get() = list.size
    operator fun get(i: Int) : T {
        return list[i]
    }

//    fun add(t: T) { // Type parameter T is declared as 'out' but occurs in 'in' position in type T
//        list.add(t)
//    }
}

fun feedAll1(animals: Herd1<Animal1>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat1: Animal1() {
    fun cleanLitter() {
        println("cleanLitter()")
    }
}

fun takeCareOfCats1(cats: Herd1<Cat1>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    feedAll1(cats) // 在 Herd1 的类型参数前加上 out 后，此行编译通过
}

fun main(args: Array<String>) {
    val herd = Herd1<Cat1>()
//    herd.add(Cat1())
//    herd.add(Cat1())
//    herd.add(Cat1())
//    herd.add(Cat1())
//    herd.add(Cat1())
    takeCareOfCats1(herd)
}

/**
 * 总结：
 * 1，虽然 42 行通过了编译，但是却在 main 中添加元素时编译报错了；
 * 2，学习一下类型参数的使用位置：in 位置和 out 位置：
 * 如果函数是把类型参数 T 作为返回类型，就说它在 out 位置，这个函数生产类型为 T 的值；
 * 如果函数是把类型参数 T 用作函数参数类型，就说它在 in 位置，这个函数消费类型为 T 的值。
 * 需要注意的是，构造方法的参数既不在 in 位置，也不在 out 位置，不受它们的约束。
 * 3，类型参数 T 上的关键字 out 的两层含义：
 * 子类型化会被保留，也就是协变
 * T 只能用在 out 位置
 * 4，解释一下这个例子中的报错：
 * class Herd1<out T : Animal1> 声明 T 只能用在 out 位置，但是 fun add(t: T)
 * 却又把它用在了 in 位置，所以编译器报错了。
 */





