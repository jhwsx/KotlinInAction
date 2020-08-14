package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/3
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach({
        error: String ->
        if (error.startsWith("4")) {
            clientErrors++
        } else if (error.startsWith("5")) {
            serverErrors++
        }
    })
    println("$clientErrors client errors, $serverErrors server errors")
}
class Ref<T>(var value: T)
// 这个例子展示了 lambda 捕获背后的原理。
fun printProblemCounts2(responses: Collection<String>) {
    val clientErrors = Ref(0)
    val serverErrors = Ref(0)
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors.value++
        } else if (it.startsWith("5")) {
            serverErrors.value++
        }
    }
    println("${clientErrors.value} client errors, ${serverErrors.value} server errors.")
}

fun main(args: Array<String>) {
    val responses = listOf<String>("200 OK", "403 Forbidden", "500 Internal Server Error")
    printProblemCounts(responses)
    printProblemCounts2(responses)
}

/**
 * 总结：
 * 1，在 kotlin 中不会仅限于访问 final 变量，而且在 lambda 内部还可以修改这些变量；
 * 2，从 lambda 内访问外部变量，就称这些变量被 lambda 捕捉
 */