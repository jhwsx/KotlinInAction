package com.kotlin.inaction.chapter_9

import java.util.*


/**
 *
 * @author wangzhichao
 * @since 2022/4/18
 */
fun main() {
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars: MutableList<Char> = mutableListOf('a', 'b', 'c')
    // Kotlin 中的星号投影 MutableList<*> 对应于 Java 中的无界通配符 MutableList<?>
    // MutableList<*> 等价于 MutableList<out Any?> 为什么呢？
    // 当没有任何元素类型信息的时候，把元素类型读取为 Any? 是安全的；但是向列表中写入元素是不安全的。
    val unknownElements: MutableList<*> = if (Random().nextBoolean()) list else chars
//     unknownElements.add(42) // 编译报错
    val message: Any? = unknownElements.first()
    println(message) // OK
}