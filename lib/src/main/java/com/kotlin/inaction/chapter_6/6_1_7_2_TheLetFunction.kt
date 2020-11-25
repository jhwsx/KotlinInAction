package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
class CEO(val name: String, val money: Float, val email: String)

fun getTheRichestCEOInTheWorld(): CEO? {
    return null
}

fun main(args: Array<String>) {
    val ceo: CEO? = getTheRichestCEOInTheWorld()
    if (ceo != null) {
        sendEmailTo(ceo.email)
    }

    getTheRichestCEOInTheWorld()?.let { sendEmailTo(it.email) }
}

/**
 * 总结：
 * 1，使用安全调用调用 let 函数，不必创建一个单独的变量。
 * 2, 大多数情况下不要使用嵌套的 let 函数，难以理解。
 */

