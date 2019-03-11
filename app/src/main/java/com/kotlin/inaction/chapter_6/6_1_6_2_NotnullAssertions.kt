package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
class Address(val country: String?)

class Brand(val name: String, val address: Address?)

class Phone(val model: String, val brand: Brand?)

fun main(args: Array<String>) {
//    val phone1 = Phone("M2", null)
//    val brand = phone1.brand!!
//    val address = brand.address!!
//    println(address.country)
    val phone2 = Phone("M2", null)
    println(phone2.brand!!.address!!.country)
}

/**
 * 1, phone1 的错误日志：
 * Exception in thread "main" kotlin.KotlinNullPointerException
 * at com.kotlin.inaction.chapter_6._6_1_6_2_NotnullAssertionsKt.main(6_1_6_2_NotnullAssertions.kt:16)
 * 2，phone2 的错误日志：
 * Exception in thread "main" kotlin.KotlinNullPointerException
 * at com.kotlin.inaction.chapter_6._6_1_6_2_NotnullAssertionsKt.main(6_1_6_2_NotnullAssertions.kt:20)
 * 3，不要采用 phone2 的 !! 的用法，因为它发生异常时，只会指明发生异常在哪一行代码，而不会指明异常发生在哪一个表达式。
 */