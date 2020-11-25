package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result from query '$request'"
}

fun main(args: Array<String>) {
    val service = MultiportService("https://example.kotlinlang.org", 80)
    // use run
    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    // use let
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " to port ${it.port}")
    }
    // use with
    val withResult = with(service) {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    println(result)
    println(letResult)
    println(withResult)
}

/**
 * 总结：
 * 1，run函数：通过 this 来获取上下文对象，返回值是 lambda 结果，它是一个扩展函数。
 */
