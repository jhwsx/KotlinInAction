package com.kotlin.inaction.chapter_4

import java.io.FileOutputStream
import java.io.ObjectOutputStream

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
fun main(args: Array<String>) {
    val button7 = Button7()
    val currentState = button7.getCurrentState()
    val fileOutputStream = FileOutputStream("D:/test/b.java")
    val oos = ObjectOutputStream(fileOutputStream)
    oos.writeObject(currentState)
    oos.flush()
    oos.close()
}