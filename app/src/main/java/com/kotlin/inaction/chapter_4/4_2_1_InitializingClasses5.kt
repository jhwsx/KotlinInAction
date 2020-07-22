package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/22
 */
class Secrective private constructor() {}

fun main(args: Array<String>) {
//    val secrective = Secrective()
}
/**
 * 总结：
 * 1，私有化主构造方法，确保这个类不被其他代码实例化
 * 2，java 中工具类可以这样写， 还有单例会用到；但是在 kotlin 中工具类可以使用顶层函数替代；单例可以用对象声明。
 */