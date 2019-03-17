package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/16
 */
fun f(): Unit {

}

fun g() {

}

/**
 * 总结：
 * 1，Unit 类型是 kotlin 中的 “void”，但却不止于此。
 * 2，当 kotlin 使用 Unit 作为返回类型并且没有重写泛型函数时，在底层 Unit 会被编译成旧的 void；
 * 3，Unit 是一个完备的类型，这个值也叫作 Unit。查看 Unit 类，它是一个单例类，使用了 object 来修饰。
 * 4, 使用 Unit 作为类型参数，很好地解决了使用“没有值”作为类型参数的问题。
 */