package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/10
 */
fun processTheAnswer(f: (Int) -> Int) { // Function1<Int, Int>
    println(f(42))
}