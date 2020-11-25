package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Bird(open var name: String)

class Swift(override var name: String) : Bird(name)

interface Producer<out T> { // 这个接口被声明在 T 上协变
    fun produce(): T
}

class BirdProducer : Producer<Bird> {
    override fun produce(): Bird {
        return Bird("bird")
    }
}

class SwiftProducer : Producer<Swift> {
    override fun produce(): Swift {
        return Swift("swift")
    }
}
fun main(args: Array<String>) {
    val birdProducer: Producer<Bird> = BirdProducer()
    val swiftProducer: Producer<Swift> = SwiftProducer()

    val birdProducer1: Producer<Bird> = swiftProducer // 这一句说明 Producer<Swift> 是 Producer<Bird> 的子类型。
}

/**
 * 总结：
 * 1，这一个例子展示 子类型化被保留，以及 out 关键字：
 * 一个协变类是一个泛型类，对这种类来说，如果 A 是 B 的子类型，那么 Producer<A> 就是 Producer<B> 的子类型，
 * 这时就说子类型化被保留了。
 *
 * out 关键字的使用：要声明类在某个类型参数上是可以协变的，在该类型参数的名称前加上 out 关键字即可。
 */
