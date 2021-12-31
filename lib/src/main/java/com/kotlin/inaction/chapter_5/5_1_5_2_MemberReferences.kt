package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/7
 */
fun salute() = println("Salute")

fun main(args: Array<String>) {
    run(::salute) // 成员引用引用顶层函数（不是类成员），这里省略了类名称
    // ::salute 是一个函数类型的对象，函数类型的对象可以通过括号来调用
    (::salute)()
    // 等价于
    (::salute).invoke()

    // 函数引用写法：
    a(::b)

    val d = ::b
    // 匿名函数写法：
    a(fun(param: Int): String {
        return param.toString()
    })
    val dd = fun(param: Int): String {
        return param.toString()
    }
    // lambda 写法：
    a({ param: Int -> param.toString() })
    val ddd = { param: Int -> param.toShort() }
}

fun b(param: Int): String {
    return param.toString()
}

fun a(action: (Int) -> String) {

}

fun c(): (Int) -> String {
    return ::b
}

fun cc(): (Int) -> String {
    return fun(param: Int): String {
        return param.toString()
    }
}

fun ccc(): (Int) -> String {
    return { param: Int -> param.toString() }
}

/**
 * 总结：
 * 1，成员引用不管引用的是函数还是属性，都不要在成员引用的名称后面加括号。
 * 2，成员引用引用顶层函数的例子。
 */