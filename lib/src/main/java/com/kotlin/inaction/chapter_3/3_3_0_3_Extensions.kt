package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2021/12/31
 */
fun method1(i: Int) {
    println("method1(i: Int): i=$i")
}
fun String.method1(i: Int) {
    println("String.method1(i: Int): $this $i")
}

fun <T> T.method2(i: Int) {
    println()
}

fun method3(str: String, i: Int) {

}
fun main(args: Array<String>) {
    val b: (Int) -> Unit = ::method1
    // 把扩展函数的引用赋值给变量
    val a: String.(Int) -> Unit = String::method1 // 正确，有 receiver
    /*
    Type mismatch.
    Required:
    (Int) → Unit
    Found:
    KFunction2<String, Int, Unit>
     */
    // val aa: (Int) -> Unit = String::method1 // 报错
    // 把有 receiver 的扩展函数的引用赋值给无 receiver 的函数类型的变量。
    val aaa: (String, Int) -> Unit = String::method1 // 正确, 没有 receiver
    val c: String.(Int) -> Unit = fun String.(i: Int) {
        println("fun String.(i: Int): $this $i")
    }
    val l: (String, Int) -> Unit = {str: String, i: Int ->
        println("str: String, i: Int $str $i")
    }
    val d: String.(Int) -> Unit = l
    // 直接赋值就不行
//    val dd: String.(Int) -> Unit = {str: String, i: Int ->
//        println("str: String, i: Int $str $i")
//    }
    // 无 Receiver 的函数引用也可以赋值给有 Receiver 的变量
    val e: String.(Int) -> Unit = ::method3
    b.invoke(1)
    "hello".method1(1)
    a("world", 2)
    a.invoke("2022", 3)
    c("hi", 4)
    // 使用函数引用去调用，不管是一个普通的成员函数还是扩展函数，你都需要把 Receiver 也就是接收者或者调用者作为第一个参数填进去。
    (String::method1)("hey", 5) // 扩展函数 <=> "hey".method1(5)
    (Int::toFloat)(1) // 普通函数 <=> 1.toFloat()
    d("haha", 6)
}
