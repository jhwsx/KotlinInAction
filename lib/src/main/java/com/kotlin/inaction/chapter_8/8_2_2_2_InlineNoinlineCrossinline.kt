package com.kotlin.inaction.chapter_8

/**
 * 扔物线的视频：Kotlin 源码里成吨的 noinline 和 crossinline 是干嘛的？看完这个视频你转头也写了一
 * https://www.bilibili.com/medialist/play/27559447?from=space&business=space_collection&business_id=37740&desc=0
 * inline 通过内联（即把函数内容直插到调用处）的方式来编译函数
 * noinline 局部关闭内联优化，来摆脱不能把函数类型的参数当做对象来使用的限制
 * crossinline 让内联函数里的函数类型的参数可以被间接调用，代价是不能在 lambda 表达式里面使用 return。
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {

    callHello1()
}

fun callHello1() {
    hello1 {
        println("Return callHello1")
        return
    }
    println("callHello1 end")
}

inline fun hello1(action: () -> Unit) {
    println("Hello")
    action() // 这里提示加 crossinline
}

//fun callHello2() {
//    hello2 {
//        println("Return callHello2")
//        return
//    }
//    println("callHello2 end")
//}
//
//inline fun hello2(action: () -> Unit) {
//    println("Hello")
//    // hello 对 action 的调用变成了间接调用，这样 action 和 hello 之间的关系被切断了。
//    runOnUiThread {
//        // 这里提示Can't inline 'action' here: it may contain non-local returns.
//        // Add 'crossinline' modifier to parameter declaration 'action'
//        // 加上 crossinline，看 hello3
//        action()
//    }
//}

fun callHello3() {
    hello3 {
        println("Return callHello2")
        // 报错：'return' is not allowed here
        // Kotlin 规定：内联函数里被 crossinline 修饰的函数类型的参数，不再享有 lambda 表达式可以使用 return 的福利。
        // return
    }
    println("callHello2 end")
}

inline fun hello3(crossinline action: () -> Unit) {
    println("Hello")
    // hello 对 action 的调用变成了间接调用，这样 action 和 hello 之间的关系被切断了。
    runOnUiThread {
        action()
    }
}

fun runOnUiThread(action: () -> Unit) {
    action()
}
