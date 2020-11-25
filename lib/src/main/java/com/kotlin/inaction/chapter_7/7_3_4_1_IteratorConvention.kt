package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/11
 */
fun main(args: Array<String>) {
    for (c in "kotlin") {
        println(c)
    }
}

/**
 * 总结：
 * 1，for 循环中使用 in 运算符用于迭代或叫遍历；
 * 2，上面的例子使用 in 运算符，实际调用的是 Strings.kt 中的
 * public operator fun CharSequence.iterator(): CharIterator = object : CharIterator() {
 *      private var index = 0
 *
 *      public override fun nextChar(): Char = get(index++)
 *
 *      public override fun hasNext(): Boolean = index < length
 *  }
 * 看一下这个方法，它有 operator 关键字，说明是一个重载运算符，
 * 它是 CharSequence 的一个名字为 iterator 的扩展方法
 */