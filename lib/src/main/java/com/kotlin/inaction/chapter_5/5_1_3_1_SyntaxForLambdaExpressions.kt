package com.kotlin.inaction.chapter_5


/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {

    val sum = { x: Int, y: Int -> x + y }
    println("sum=$sum") // sum=Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
    println(sum(1, 2))

    val sum1 = object : Function2<Int, Int, Int> {
        override fun invoke(x: Int, y: Int): Int {
            return x + y
        }
    }
    println("sum1=${sum1}")
    println(sum1(1, 2))
    // 等价写法
    println(sum1.invoke(1,2))
    // 匿名函数是个对象
    val sum2 = fun(x: Int, y: Int): Int {
        return x + y
    }
    println("sum2=${sum2}")
    println(sum2(1, 2))
    val print = { x: Int -> println(x) }

    print(33)
}

/**
 * 总结：
 * 1，学习 lambda 表达式的语法：
 * 一个 lambda 把一小段行为进行编码，可以把它当作值到处传递；
 * 可以把它独立地声明并储存到一个变量中；
 * 常见的是直接声明它并传递给函数。
 *
 * { x: Int, y: Int -> x + y }
 * kotlin 中的 lambda 表达式始终用花括号包围着；
 * 箭头左边的是实参；
 * 箭头右边的是 lambda 的函数体。
 */