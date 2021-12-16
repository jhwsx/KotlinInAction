package com.kotlin.inaction.chapter_4

// https://www.bennyhuo.com/2021/01/23/kotlin-sealed-interface/
// 密封接口来了
class Song
class Options
sealed interface PlayerState {
    class Error(val t: Throwable) : PlayerState
    object Idle : PlayerState
    open class Playing(val song: Song) : PlayerState
    class PlayingWithOptions(song: Song, val options: Options) : Playing(song)
}

//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr

sealed interface Expr3 {
    class Num3(val value: Int) : Expr3
    class Sum3(val left: Expr3, val right: Expr3) : Expr3
}

fun evaluate(expr: Expr3): Int {
    return when (expr) {
        is Expr3.Num3 -> expr.value
        is Expr3.Sum3 -> evaluate(expr.left) + evaluate(expr.right)
    }
}

fun main() {
    val result = evaluate(Expr3.Sum3(Expr3.Num3(1), Expr3.Sum3(Expr3.Num3(2), Expr3.Num3(4))))
    println(result)
}