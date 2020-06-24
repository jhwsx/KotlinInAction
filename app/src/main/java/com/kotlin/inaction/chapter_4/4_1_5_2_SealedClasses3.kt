package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
sealed class Expr2
class Num1(val value: Int) : Expr2()
class Sum1(val left: Expr2, val right: Expr2) : Expr2()
fun eval2(e: Expr2): Int =
    when (e) {
        is Num1 -> e.value
        is Sum1 -> eval2(e.right) + eval2(e.left)
    }

fun main(args: Array<String>) {
    println(eval2(Sum1(Num1(1), Num1(2))))
}
/**
 * 总结：
 * 1，嵌套类的一个使用场景：创建一个包含有限数量的类的继承结构：密封类，使用sealed 修饰符修饰。
 * 2，为父类添加一个 sealed 修饰符，对可能创建的子类做出严格的限制。
 * 3，原来的写法，在when中必须写出else，还有即使添加了一个新的分支，编译器也不知道有地方改变了。
 * 现在使用 sealed 类限制的子类，如果少一个分支，编译器就知道了，多一个分支，也不行。
 * 4，在 kotlin 1.0 中， sealed 类的子类必须嵌套在父类之中，而在 kotlin 1.1 中，就没有这些限制了。
 * 5, sealed 修饰的类默认就是 open 的.
 */