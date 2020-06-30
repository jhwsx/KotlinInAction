package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval1(e: Expr1): Int =
    when (e) {
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval1(e.right) + eval1(e.left)
    }
/**
 * 总结：
 * 1，嵌套类的一个使用场景：创建一个包含有限数量的类的继承结构：密封类，使用sealed 修饰符修饰。
 * 2，为父类添加一个 sealed 修饰符，对可能创建的子类做出严格的限制。
 * 3，原来的写法，在when中必须写出else，还有即使添加了一个新的分支，编译器也不知道有地方改变了。
 * 现在使用 sealed 类限制的子类，如果少一个分支，编译器就知道了，多一个分支，也不行。
 * 4，在 kotlin 1.0 中， sealed 类的子类必须嵌套在父类之中，而在 kotlin 1.1 中，允许在同一文件的任何位置
 * 定义 sealed 类的子类。
 * 5, sealed 修饰符隐含的这个类是一个 open 类。
 */