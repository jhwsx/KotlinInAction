package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
data class SiteVisit2(
    val path: String,
    val duration: Double,
    val os: OS2
)

enum class OS2 { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log2 = mutableListOf(
    SiteVisit2("/",34.0, OS2.WINDOWS),
    SiteVisit2("/",22.0,OS2.MAC),
    SiteVisit2("/login",12.0,OS2.WINDOWS),
    SiteVisit2("/signup",8.0,OS2.IOS),
    SiteVisit2("/",16.3,OS2.ANDROID)
)

val averageMobileDuration = log2
    .filter { it.os in setOf(OS2.ANDROID, OS2.IOS) }
    .map (SiteVisit2::duration)
    .average()
fun main(args: Array<String>) {
    println(averageMobileDuration)
}