package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
data class SiteVisit1(
    val path: String,
    val duration: Double,
    val os: OS1
)

enum class OS1 { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log1 = mutableListOf(
    SiteVisit1("/",34.0, OS1.WINDOWS),
    SiteVisit1("/",22.0,OS1.MAC),
    SiteVisit1("/login",12.0,OS1.WINDOWS),
    SiteVisit1("/signup",8.0,OS1.IOS),
    SiteVisit1("/",16.3,OS1.ANDROID)
)
// 将平台类型抽取为一个函数，这里是定义了一个扩展函数
fun List<SiteVisit1>.averageDurationFor(os: OS1) =
        filter { it.os == os }.map(SiteVisit1::duration).average()

fun main(args: Array<String>) {
    println(log1.averageDurationFor(OS1.WINDOWS))

    println(log1.averageDurationFor(OS1.MAC))
}