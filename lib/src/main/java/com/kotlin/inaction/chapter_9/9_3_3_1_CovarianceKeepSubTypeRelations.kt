package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/14
 */
open class Bird(open var name: String)

class Swift(override var name: String) : Bird(name)

interface Producer1<T> {
    fun produce(): T
}

class BirdProducer1 : Producer1<Bird> {
    override fun produce(): Bird {
        return Bird("bird")
    }
}

class SwiftProducer1 : Producer1<Swift> {
    override fun produce(): Swift {
        return Swift("swift")
    }
}

interface Producer<out T> { // 这个接口被声明在 T 上协变，对应于 Java 的 ? extends T 了。
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
    val swiftProducer1: Producer1<Swift> = SwiftProducer1()
    // 编译报错：类型不匹配
    // Type mismatch.
    // Required:
    // Producer1<Bird>
    // Found:
    // Producer1<Swift>
    // val birdProducer1: Producer1<Bird> = swiftProducer1
    // 加上 out 修饰符后编译通过，等同于 Java 中的 ? extends Bird
    val birdProducer1: Producer1<out Bird> = swiftProducer1

    // 因为 Producer 所有的使用场景都是用来输出的，避免在每个使用的位置都给变量或者参数加上 out 的麻烦，
    // 就直接在声明 Producer 类的时候，直接使用 out 来修饰类型形参了，这其实是个简便写法而已。
    val swiftProducer: Producer<Swift> = SwiftProducer()
    val birdProducer: Producer<Bird> = swiftProducer // 这一句说明 Producer<Swift> 是 Producer<Bird> 的子类型。


}

/**
 * 总结：
 * 1，这一个例子展示 子类型化被保留，以及 out 关键字：
 * 一个协变类是一个泛型类，对这种类来说，如果 A 是 B 的子类型，那么 Producer<A> 就是 Producer<B> 的子类型，
 * 这时就说子类型化被保留了。
 *
 * out 关键字的使用：要声明类在某个类型参数上是可以协变的，在该类型参数的名称前加上 out 关键字即可。
 */
