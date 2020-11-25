package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/16
 */
fun main(args: Array<String>) {
    val toInt = "100".toInt()
    println(toInt)
    val toFloat = "123.4f".toFloat()
    println(toFloat)
    val toByte = "1".toByte()
    println(toByte)
    val toBoolean = "true".toBoolean()
    println(toBoolean)
//    "1f".toInt() // 此行会报错
//    Exception in thread "main" java.lang.NumberFormatException: For input string: "1f"
//    at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//    at java.lang.Integer.parseInt(Integer.java:580)
//    at java.lang.Integer.parseInt(Integer.java:615)
//    at com.kotlin.inaction.chapter_6._6_2_3_4_NumberConversionsKt.main(6_2_3_4_NumberConversions.kt:17)
}

/**
 * 总结：
 * 1，字符串转换：扩展方法，把字符串转换成基本数据类型
 */