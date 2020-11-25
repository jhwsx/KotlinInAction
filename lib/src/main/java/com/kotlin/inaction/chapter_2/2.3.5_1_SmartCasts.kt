package com.kotlin.inaction.chapter_2

import java.lang.IllegalArgumentException

/**
 *
 * @author wzc
 * @date 2019/1/6
 */
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 这里可以看到，显式地转换成 Num 是多余的
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left) // 这里进行了智能转换
    }
    throw IllegalArgumentException("Unknown Exception")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}

/**
 * 总结：
 * 1，这里的 interface Expr 是一个标记接口，它没有声明任何方法，
 * 用来给不同类型的表达式提供一个公共的类型
 * 2，kotlin 中声明类的时候，使用一个冒号(:)后面跟上接口名称，来标记这个类实现了这个接口
 * 3，kotlin 中 智能转换：检查过一个变量是某种类型后，后面就不需要再转换它，可以把它当做你检查过的类型使用
 * 4，智能转换的条件是只有在变量经过 is 检查且之后不再发生变化的情况下有效
 * 5，当对一个类的属性进行智能转换的时候，这个属性必须是一个 val 属性，且不能有自定义的访问器
 * 6，kotlin 进行显示转换使用的是 as, 这个是不安全的。
 */
