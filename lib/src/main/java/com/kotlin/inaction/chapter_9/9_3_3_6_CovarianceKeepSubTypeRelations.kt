package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/17
 */
open class Animal4 {
    fun feed() {
        println("feed()")
    }
}

// 编译错误：Type parameter T is declared as 'out' but occurs in 'invariant' position in type T
// leadAnimal 属性的 setter 在 in 位置用到了类型形参 T。
//class Herd4<out T: Animal4>(var leadAnimal: T, vararg animals: T)

class Herd5<out T : Animal4>(val leadAnimal: T, vararg animals: T) // 编译通过

// 编译错误：Type parameter T is declared as 'in' but occurs in 'out' position in type T
//class Herd6<in T: Animal4>(val leadAnimal: T)

// 编译错误：Type parameter T is declared as 'in' but occurs in 'invariant' position in type T
//class Herd7<in T: Animal4>(var leadAnimal: T)

/**
 * 总结：
 * 1，这个例子展示了构造函数的参数上使用了关键字 var 和 val 的情况：
 * 对于只读属性来说，类型参数用在了 out 位置；对于可变属性，类型参数用在了 out 位置和 in 位置。
 * 2，声明为 out, 那么类型参数还是只能用在 out 位置上，13 行的参数是可变属性，等于用在了 out 位置 和 in 位置，编译失败
 * 15 行的参数是只读属性，等于用在了 out 位置，编译通过
 */
