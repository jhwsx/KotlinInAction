package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/5/13
 */
fun <T> Collection<T>.joinToString3(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform:((T) -> String)? = null
):String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform?.invoke(element)?:element)
//        if (transform != null) {
//            result.append(transform(element))
//        } else {
//            result.append(element)
//        }

    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val letters = listOf("Adups", "Adup")
    println(letters.joinToString3())
    println(letters.joinToString3 { it.toUpperCase() })
    println(
        letters.joinToString3(
            separator = "! ",
            postfix = "! ",
            transform = { it.toUpperCase() })
    )
}
/**
 * 总结：
 * 1，这个例子优化了上一个例子，因为函数类型是一个包含 invoke 方法的接口的具体实现。
 * 进一步利用了安全调用语法，以及 Elvis 运算符。
 */