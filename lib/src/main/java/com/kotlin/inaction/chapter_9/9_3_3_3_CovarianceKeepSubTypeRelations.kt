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

class Herd1<out T : Animal1> { // 类被声明成在类型形参 T 上协变
    private val list = arrayListOf<T>()
    val size: Int get() = list.size
    operator fun get(i: Int) : T { // out 位置
        return list[i]
    }
    // 参考 Kotlin 的 List 接口，加上 @UnsafeVariance 这个注解
    fun add(t: @UnsafeVariance T) {
        list.add(t)
    }
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
    herd.add(Cat1())
    herd.add(Cat1())
    herd.add(Cat1())
    herd.add(Cat1())
    herd.add(Cat1())
    takeCareOfCats1(herd)
}
// Type parameter E is declared as 'out' but occurs in 'in' position in type E
//public interface MyMutableList<out E> : List<E>, MutableCollection<E> {
//    override fun add(element: E): Boolean
//}

/**
 * 总结：
 * 1，虽然 42 行通过了编译，但是却在 main 中添加元素时编译报错了；添加 @UnsafeVariance 来解决。
 * 2，学习一下类型参数的使用位置：in 位置和 out 位置：
 * 如果函数是把类型参数 T 作为返回类型，就说它在 out 位置，这个函数生产类型为 T 的值；
 * 如果函数是把类型参数 T 用作函数参数类型，就说它在 in 位置，这个函数消费类型为 T 的值。
 * 需要注意的是，构造方法的参数既不在 in 位置，也不在 out 位置，不受它们的约束。
 * interface Transformer<T> {
 *      fun transform(t: T): T
 * }
 * 括号中的 T 就是在 "in" 位置, 返回值的 T 就是在 "out" 位置
 * 3, 类的类型参数前的 out 关键字要求所有使用 T 的方法只能把 T 放在 out 位置而不能放在 in 位置.
 * 这个关键字约束了使用 T 的可能性，但是这保证了对应子类型关系的安全性。
 * 4，类型参数 T 上的关键字 out 的两层含义：
 * 子类型化会被保留，也就是协变
 * T 只能用在 out 位置
 * 5，解释一下这个例子中的报错：
 * class Herd1<out T : Animal1> 声明 T 只能用在 out 位置，但是 fun add(t: T)
 * 却又把它用在了 in 位置，所以编译器报错了。
 * 6，MutableList<T> 的类型参数不可以声明为协变的，因为它既有接收类型为 T 的值为参数的方法，也有返回这种
 * 值的方法，也就是说，T 出现在了 in 和 out 两种位置上。
 */





