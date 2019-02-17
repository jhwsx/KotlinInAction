package com.kotlin.inaction.chapter_5

import java.io.File

/**
 *
 * @author wzc
 * @date 2019/2/17
 */
fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun File.findInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.find { it.isHidden }

fun main(args: Array<String>) {
    val file = File("C:\\Users\\wangzhichao\\svtk\\HiddenDir\\a.txt")
    val insideHiddenDirectory = file.isInsideHiddenDirectory()
    println(insideHiddenDirectory)
    if (insideHiddenDirectory) {
        println(file.findInsideHiddenDirectory())
    }
}