package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
data class SiteVisit4(
    val path: String,
    val duration: Double,
    val os: OS4
)

enum class OS4 { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log4 = mutableListOf(
    SiteVisit4("/",34.0, OS4.WINDOWS),
    SiteVisit4("/",22.0,OS4.MAC),
    SiteVisit4("/login",12.0,OS4.WINDOWS),
    SiteVisit4("/signup",8.0,OS4.IOS),
    SiteVisit4("/",16.3,OS4.ANDROID)
)

fun List<SiteVisit4>.averateDurationFor(predicate: (SiteVisit4) -> Boolean) =
        filter(predicate).map(SiteVisit4::duration).average()
fun main(args: Array<String>) {
    println(log4.averateDurationFor { it.os in setOf<OS4>(OS4.ANDROID, OS4.IOS) })
    println(log4.averateDurationFor { it.os == OS4.IOS && it.path == "/signup" })
}

/**
 * 总结：
 * 1，用一个高阶函数去除重复代码;
 * 2, 使用 lambda 不仅可以抽取重复的数据，还可以抽取重复的行为。
 */