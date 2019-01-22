package com.kotlin.inaction.chapter_2.pkg.example

import com.kotlin.inaction.chapter_2.pkg.rectangle.createRandomRectangle

/**
 *
 * @author wzc
 * @date 2019/1/5
 */
fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}

/*
* 总结：
* 1，在 java 中，放入一个包中的是类，在 kotlin 中，文件中定义的所有声明
* （类、函数及属性）都会被放到这个包中。从这里看出，函数及属性在 kotlin 中的突出地位。
* 2，kotlin 中，import 不仅可以导入类，还可以直接导入顶层函数，看上面的例子。
* 3，kotlin 包层级结构可以不遵循目录层级结构*/