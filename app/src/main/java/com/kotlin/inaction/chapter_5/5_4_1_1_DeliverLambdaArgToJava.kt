package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/17
 */
fun main(args: Array<String>) {
    // 传递 lambda 表达式
    ReceiveLambdaArg.postponeComputation(1000) { println(42) } // 整个程序只会创建一个 Runnable 实例
    // 传递 匿名对象 的方式
    ReceiveLambdaArg.postponeComputation(1000, object : Runnable {
        override fun run() {
            println(43)
        }
    })
    // 这种用法和第一种是等价的
    val runnable = Runnable { println(44) } // 可以重用
    ReceiveLambdaArg.postponeComputation(1000, runnable)

    handleComputation("create new instance every time")
}

fun handleComputation(id: String) {
    ReceiveLambdaArg.postponeComputation(1000) { println(id) } // lambda 捕获 id 这个变量，这样 handleComputation 调用时都会创建一个新的 Runnable 实例了。
}
/**
 * 总结：
 * 1，kotlin 可以把 lambda 当作参数传递给 Java 方法；
 * 2，传递 lambda 和 匿名对象 的区别是什么？
 *      当显式地声明对象时，每次调用都会创建一个新的实例；
 *      使用 lambda 的情况不同：如果 lambda 没有访问任何来自定义它的函数的变量，相应的匿名类实例可以在多次调用之间重用
 * 3, 如果 lambda 从包围它的作用域中捕捉了变量，每次调用就不再可能重用同一个实例了。
 */