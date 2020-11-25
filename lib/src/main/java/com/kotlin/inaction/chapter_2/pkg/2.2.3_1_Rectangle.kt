package com.kotlin.inaction.chapter_2.pkg.rectangle

import java.util.*

/**
 *
 * @author wzc
 * @date 2019/1/5
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}
fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}