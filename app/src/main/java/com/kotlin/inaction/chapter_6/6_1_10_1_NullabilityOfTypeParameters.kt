package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
fun <T> printHashCode(t: T) { // T 会被推导成 Any?
    println(t?.hashCode()) // 这里要用安全调用，因为 t 是可空的
}

fun <T : Any> printHashCode2(t: T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
//    printHashCode2(null) // 此行编译报错 Type parameter bound for T in
//    fun <T : Any> printHashCode2
//                (
//        t: T
//    )
//            : Unit
//    is not satisfied: inferred type Nothing? is not a subtype of Any
    printHashCode2("wzc")
}

/**
 * 总结：
 * 1，类型参数的可空性：kotlin 中所有泛型类和泛型函数的类型参数默认都是可空的。
 * 2，任何类型包括可空类型，都可以替换类型参数。
 * 3，要使类型参数非空，必须要为它指明一个非空的上界
 * 4, 类型参数后面没有带?,但也是可空的，这是一个例外。
 */