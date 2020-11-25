package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
fun fizzbuzz2(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }
fun main(args: Array<String>){
    for (i in 100 downTo 1 step 2) {
        print(fizzbuzz2(i))
//        print("$i ")
    }
}
/**
 * 总结：
 * 1，kotlin 中 步长 的概念：一个带步长的数列，允许跳过一些数字。步长可以是负数，步长是负数的话，
 * 数列就是递减的
 * 2, 100 downTo 1，表示从100 到 1 的递减数列，这时步长是 -1，而再用上 step 2，就把步长的绝对值变为2，这时步长就是 -2
 */
