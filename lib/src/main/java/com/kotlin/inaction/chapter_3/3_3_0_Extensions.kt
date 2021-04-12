package com.kotlin.inaction.chapter_3

/**
 * 参考：
 * https://mp.weixin.qq.com/s/NKymd7Suc52j4E5nhg5MSQ
 *
 * @author wzc
 * @date 2019/1/12
 */
fun String.lastChar(): Char = this.get(this.length - 1) // this 是可以省略的

fun String.firstChar(): Char = get(0)

fun String.printSelf() {
    print(this)
}
fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".firstChar())
    "Kotlin".printSelf()
}

fun print(str: String) {
    println(str)
}

/**
 * 总结：
 * 1，kotlin 中使用扩展函数，就是一个类的成员函数，不过是定义在类的外边；
 * 2，扩展函数的具体做法：把要扩展的类或者接口的名称，放到即将添加的函数前面，
 * 这个类的名称被称为接收者类型；用来调用这个扩展函数的那个对象，叫做接收者对象
 * fun String.lastChar(): Char = this.get(this.length - 1)
 * 这里 String 是接收者类型， "Kotlin" 是接收者对象
 * 3，在扩展函数中，可以直接访问被扩展的类的其他方法和属性；但是，不可以访问私有
 * 的或者是受保护的成员
 */
