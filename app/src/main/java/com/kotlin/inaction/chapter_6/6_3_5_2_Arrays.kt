package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
fun main(args: Array<String>) {
    val strings = listOf<String>("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    val squares = IntArray(5) {i -> (i + 1) * (i + 1)}
    println(squares.joinToString())

    args.forEachIndexed { index, element ->
        println("Element $index is $element")
    }

    val array = Array<Int>(10) { it + 1}
    println(array.joinToString())
    val intArray = array.toIntArray()
    println(intArray.joinToString())

}

/**
 * 1, * 是展开运算符， 期望 vararg 参数时，使用展开运算符（*）传递数组。
 * 2，
 * Array<Int> 对应于 java.lang.Integer[]
 * Array<Long> 对应于 java.lang.Long[]
 * IntArray 对应于 int[]
 * LongArray 对应于 long[]
 *
 */