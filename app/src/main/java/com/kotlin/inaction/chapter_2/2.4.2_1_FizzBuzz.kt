package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun fizzbuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }

fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzbuzz(i))
    }
}
/**
 * 总结：
 * 1，kotlin 中的 区间：本质上两个值之间的间隔，通常是两个数字之间的间隔，使用 .. 来表示区间，区间是闭合的
 * 2，kotlin 中的 数列，如果你能迭代区间中所有的值，这样的区间被称为数列
 */
