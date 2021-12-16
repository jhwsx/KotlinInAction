package com.kotlin.inaction.chapter_4

// https://mp.weixin.qq.com/s/yrWJ-ApIMTs979NW1v42UQ
// 谷歌开发者公众号：Kotlin Vocabulary | 密封类 sealed class
sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
    object InProgress : Result<Nothing>()
}

sealed class Result1<out T: Any> {
    data class Success1<out T : Any>(val data: T): Result1<T>()
    sealed class Error1(val exception: Exception): Result1<Nothing>() {
        class NetError(exception: Exception) : Error1(exception)
        class ServerError(exception: Exception) : Error1(exception)
    }
}


val <T> T.exhaustive: T
    get() = this

fun checkResult(result: Result<*>) {
    when (result) {
        is Result.Success -> println("success")
        is Result.Error -> println("error")
        is Result.InProgress -> println("in progress")
    }.exhaustive
}

fun checkResult1(result: Result1<*>) {
    when (result) {
        is Result1.Error1.NetError -> println("net error")
        is Result1.Error1.ServerError -> println("server error")
        is Result1.Success1 -> println("success")
    }.exhaustive
}

fun main() {

}
