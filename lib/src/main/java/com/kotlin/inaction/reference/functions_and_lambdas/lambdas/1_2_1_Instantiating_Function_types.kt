package com.kotlin.inaction.reference.functions_and_lambdas.lambdas

/**
 *
 * @author wangzhichao
 * @since 2022/1/13
 */
// 在函数字面量内部使用代码块
val lambdaExpression: (Int, Int) -> Int = { a, b -> a + b }
val anonymousFunction: (String) -> Int = fun(s: String): Int {
    return s.toIntOrNull() ?: 0
}

// 使用一个可调用的引用给一个现存的声明

val i: Int = 0
fun topMethod(i: Int, j: Int): String {
    return (i + j).toString()
}

class ClazzA {
    var a: String = "a"
    fun memberMethod(s: String): Unit {

    }
}

fun ClazzA.extensionMethod(): String {
    return javaClass.name
}

val ClazzA.size
    get() = 5

val topReference = ::topMethod
val memberReference = ClazzA::memberMethod
val extensionReference = ClazzA::extensionMethod

val topProperty = ::i
val memberProperty = ClazzA::a
val extensionProperty = ClazzA::size

val clazzA = ClazzA()
val memberProperty2 = clazzA::a

// Use instances of a custom class that implements a function type as an interface
class IntTransformer : (Int) -> Int {
    override fun invoke(x: Int): Int {
        return 100 * x
    }
}

val intFunction: (Int) -> Int = IntTransformer()

// 带接收者的函数类型和不带接收者的函数类型相互转换
val repeatFun: String.(Int) -> String = { times -> this.repeat(times)}
val twoParameters: (String, Int) -> String = repeatFun