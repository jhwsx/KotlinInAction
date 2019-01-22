package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun main(args: Array<String>) {
    val kotlinlogo = """| //
    .|//
    .|/ \"""
    println(kotlinlogo.trimMargin(".")) // 避免转义字符
    val multline = """第一行
        |第二行
        |第三行
    """.trimMargin() // 包含多行
    println(multline)

    val path = """C:\Users\wzc\kolin"""
    println(path)

    println("""$ {'$'} 99.99""")
}