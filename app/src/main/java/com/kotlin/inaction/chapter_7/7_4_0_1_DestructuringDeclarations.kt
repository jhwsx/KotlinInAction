package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
data class Point8(val x: Int, val y: Int)

fun main(args: Array<String>) {
    val p = Point8(10, 20)
    val (x, y) = p
    println("x=$x, y=$y")
}

/**
 * 总结：
 * 1，在解构声明中初始化每个变量，将调用名字为 componentN 的函数。
 * 上面的例子对应的 java 代码是：
 * Point8 p = new Point8(10, 20);
 * int x = p.component1();
 * int y = p.component2();
 * String var3 = "x=" + x + ", y=" + y;
 * boolean var4 = false;
 * System.out.println(var3);
 * 2，对于数据类，编译器为每个在主构造方法中声明的属性生成一个 componentN 函数。
 * 注意是数据类，并且是在主构造方法中声明的属性，两个条件。
 */