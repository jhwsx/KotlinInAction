package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = mutableListOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

// 显示来自 Windows 机器的平均访问时间。
val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    // 正确的写法一：使用 lambda 表达式
//    .map { siteVisit -> siteVisit.duration }
    // 正确的写法：使用成员引用
    .map(SiteVisit::duration)
    // 错误的写法：使用成员引用，却还用了花括号，这种不伦不类的写法
//    .map { SiteVisit::duration }
    .average()

fun main(args: Array<String>) {
    println(averageWindowsDuration)
}