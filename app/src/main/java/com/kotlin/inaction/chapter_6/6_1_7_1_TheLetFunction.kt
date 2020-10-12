package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
fun sendEmailTo(email: String) {
    println("Send email to $email")
}

fun getQQEmail(qqNumber: String): String {
    return "$qqNumber@qq.com"
}

fun main(args: Array<String>) {
    // 原来的写法
//    val email1: String? = null
//    sendEmailTo(email1)
//    if (email1 != null) {
//        sendEmailTo(email1)
//    }
    // 使用 let 函数后的写法
    // let 函数返回的是 lambda 表达式的结果
    val email2: String? = "willwaywang6@gmail.com"
    email2?.let { email -> sendEmailTo(email) }
    val email3: String? = null
    email3?.let { sendEmailTo(it) }
    println("apply:")
    // 但是，apply 函数返回的还是调用者
    email2?.apply { sendEmailTo(this) }
    email3?.apply { sendEmailTo(this) }

    println("---------------------------")
    val qqNumber: String? = null
    val qqNumber2: String? = "392337950"
    println(qqNumber?.let { getQQEmail(it) })
    println(qqNumber2?.let { getQQEmail(it) })
}

/**
 * 总结：
 * 1，使用 let 函数的例子
 * 2，用法：let 函数是一个函数，通过安全调用（?.）来调用它
 * 3，作用：把一个调用 let 函数的对象变成 lambda 表达式的参数
 * 4, 结合安全调用语法，能有效地把调用 let 函数的可空对象，转变成非空类型。
 * 安全调用 let 函数只有在表达式不为 null 时执行 lambda。
 */