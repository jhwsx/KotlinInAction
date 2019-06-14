package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/14
 */
class Processor1<T> {
    fun process(value: T) =
        value?.hashCode()
}

class Processor2<T : Any?> {
    fun process(value: T) =
        value?.hashCode()
}

class Processor3<T : Any> {
    fun process(value: T) =
        value.hashCode()
}

class Processor4<T: Number> {
    fun process(value: T) = value.hashCode()
}

fun main(args: Array<String>) {
    val processor1 = Processor1<String>()
    println(processor1.process("adups"))
//    processor1.process(null)
    val processor11 = Processor1<String?>()
    println(processor11.process(null))
}

/**
 * 总结：
 * 1，没有指定上界的类型形参将会使用 Any? 作为默认上界，所以 Processor1 和 Processor2 是等价的；
 * 2，约束<T ： Any> 可以确保类型 T 永远是非空类型。也可以指定任何非空类型作为上界来达到同样的效果。
 */

