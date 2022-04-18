package com.kotlin.inaction.chapter_9

import kotlin.reflect.KFunction1

/**
 *
 * @author wzc
 * @date 2022/4/17
 */
fun enumerateCats(f: (Cat) -> Number) {

}
fun Animal.getIndex(): Int {
    return 1
}
fun main(args: Array<String>) {
    val f1: (Animal) -> Int = Animal::getIndex
    enumerateCats(f1)
    val f2: (Animal) -> Int = {
        it.getIndex()
    }
    enumerateCats(f2)
}

/**
 * 在 Functions.kt 类中定义好多 FunctionXX 接口
 * P1 类型形参是 in 关键字修饰的，表示这个类型形参只能用在 in 位置，子类型化反转了
 * R 类型形参是 out 关键字修饰的，表示这个类型形参只能用在 out 位置，子类型化保留了
 * 也就是说，函数(P1) -> R 在它的参数类型上逆变而在返回类型上协变。
 * public interface Function1<in P1, out R> : Function<R> {
 *   public operator fun invoke(p1: P1): R
 * }
 */