package com.kotlin.inaction.chapter_2

/**
 *
 * @author wzc
 * @date 2018/12/27
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 自定义访问器，用于检查矩形是否是正方形，但不需要一个单独的字段来存储这个信息
            return height == width
        }
    val isHigher: Boolean
        get() = height > width

    val isWider: Boolean
        get() = width > height
    /*
    等价于 java 的形式：
    public final boolean isSquare() {
      return this.height == this.width;
   }
*/
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    println("rectangle.isHigher=${rectangle.isHigher}")
    val square = Rectangle(50, 50)
    println(square.isSquare)
    val rectangle2 = Rectangle(43, 41)
    println("rectangle2.isWider=${rectangle2.isWider}")
}

/*
自定义访问器
 */