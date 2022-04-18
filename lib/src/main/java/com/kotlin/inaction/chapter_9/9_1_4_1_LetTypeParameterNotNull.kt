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
    // Processor1
    val processor1 = Processor1<String>()
    println(processor1.process("adups"))
//    processor1.process(null) // 编译报错: 不能是 null
    val processor11 = Processor1<String?>()
    println(processor11.process(null))

    // Processor2
    val processor2 = Processor2<String>()
    println(processor2.process("adups"))
//    processor2.process(null) // 编译报错: 不能是 null
    val processor22 = Processor2<String?>()
    println(processor22.process(null))

    // Processor3
    val processor3 = Processor3<String>()
//    val processor33 = Processor3<String?>() // 编译报错: 需要 Any, 而不是 String?

    // Processor4
    val processor4 = Processor4<Number>()
//    val processor44 = Processor4<Number?>() // 编译报错:需要 Number, 而不是 Number?
}

/**
 * 总结：
 * 1，没有指定上界的类型形参将会使用 Any? 作为默认上界，所以 Processor1 和 Processor2 是等价的；
 * 2，约束<T ： Any> 可以确保类型 T 永远是非空类型。也可以指定任何非空类型作为上界来达到同样的效果。
 */

