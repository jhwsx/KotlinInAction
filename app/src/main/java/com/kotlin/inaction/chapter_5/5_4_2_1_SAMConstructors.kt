package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/17
 */
fun createAllDoneRunnable(): Runnable { // 这个函数返回的是一个函数式接口的实例，不能直接返回一个 lambda
    return Runnable { println("All done!") } // 所以用 SAM 构造方法把 lambda 包装起来
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}

/**
 * 总结：
 * 1，什么是 SAM 构造方法？
 * SAM 构造方法是编译器生成的函数，让你执行从 lambda 到函数式接口实例的显式转换。
 * 2，SAM 构造方法的用途？
 * 可以在编译器不会自动应用转换的上下文中使用它。
 * 3，SAM 构造方法接收什么，返回什么？
 * SAM 构造方法只接收一个参数，一个被用作函数式接口单抽象方法体的 lambda；
 * 返回实现了这个接口的类的一个实例。Single Abstract Method.
 */