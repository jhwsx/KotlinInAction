package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/13
 */
fun test(i: Int) {
    val n: Number = i // Int 是 Number 的子类型
    fun f(s: String) {
        println(s)
    }
   // f(i) // 此行不会通过编译，因为 Int 不是 String 的子类型
}

fun testMe(i: Int) {
    val n: Int = i // Int 是它自己的子类型
}

fun testNullable(s: String?) {
    val ss: String? = s
    println(ss)
}

fun main(args: Array<String>) {
    testNullable("adups")
    val sss: String = "abup"
    val ssss: String? = sss

}

/**
 * 总结：
 * 1，学习子类型和超类型的术语
 * 如果需要类型 A 的值，这时可以使用类型 B 的值当做类型 A 的值，就说类型 B 是类型 A 的子类型。
 * 若类型 B 是类型 A 的子类型，那么就可以说类型 A 是类型 B 的超类型。
 * 2，编译器在每一次给变量赋值或者给函数传递实参的时候都要检查一个类型是否是另一个类型的子类型。
 * 只有是的时候，才允许赋值或者传参。
 * 3, 子类型和子类的区别：
 * 大体上一样，但也有反例：非空类型 A 是可空类型 A? 的子类型，但反过来却不是。这一点是 java 没有的。
 */
