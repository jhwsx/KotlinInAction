package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/7
 */
fun main(args: Array<String>) {
    // 把 lambda 保存在局部变量中

    // 由 kotlin 的类型推导可以得出变量的类型
    val sum = { x: Int, y: Int -> x + y }
    // val sum2 = {x, y -> x + y} // 不能推导出类型来
    val action = { println(32) }

    // 显式地声明变量的类型
    val sum1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = { x, y -> x + y } // lambda 表达式中省略了参数x,y的类型
    val action1: () -> Unit = { println(32) }
//    val action2:() ->= { println(32)} // Unit 不可以省略

    // 函数类型的返回值可以标记为可空类型
    var canReturnNull: (Int, Int) -> Int? = { x, y -> null }
    val canReturnNull1: () -> Int? = { null }

    // 定义一个函数类型的可空变量
    var funOrNull: ((Int, Int) -> Int)? = null


    val url = "http://kotlin"
    performRequest(url) {code, content -> println(url)}
    performRequest(url) {code, page -> println(url)}
}

// 函数类型的参数名例子
fun performRequest(url: String, callBack: (code: Int, content: String) -> Unit) {

}

/**
 * 总结：
 * 1，如何声明函数类型呢？
 * 将函数参数类型放在括号中，后面是一个箭头，再后面是函数的返回类型
 * 2，一个函数类型总是需要一个显式的返回类型，这种场景下 Unit 不能省略。
 */