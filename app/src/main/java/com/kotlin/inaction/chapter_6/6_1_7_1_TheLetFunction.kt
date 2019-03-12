package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
fun sendEmailTo(email: String) {
    println("Send email to $email")
}

fun main(args: Array<String>) {
    // 原来的写法
//    val email1: String? = null
//    sendEmailTo(email1)
//    if (email1 != null) {
//        sendEmailTo(email1)
//    }
    // 使用 let 函数后的写法
    val email2: String? = "willwaywang6@gmail.com"
    email2?.let { email2 -> sendEmailTo(email2) }
    val email3: String? = null
    email3?.let { sendEmailTo(it) }
}

/**
 * 总结：
 * 1，使用 let 函数的例子
 * 2，用法：let 函数是一个函数，通过安全调用（?.）来调用它
 * 3，作用：把一个调用 let 函数的对象变成 lambda 表达式的参数
 * 4, 结合安全调用语法，能有效地把调用 let 函数的可空对象，转变成非空类型。
 * 安全调用 let 函数只有在表达式不为 null 时执行 lambda。
 */