package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/17
 */
open class Animal5 {
    fun feed() {
        println("feed()")
    }
}

class Herd7<out T: Animal5>(private var leadAnimal: T, vararg animals: T) {
    private fun add(animal: T) {} // 编译通过

//    fun remove(animal: T) {} // Type parameter T is declared as 'out' but occurs in 'in' position in type T

//    protected fun change(animal: T) {} // Type parameter T is declared as 'out' but occurs in 'in' position in type T

//    internal fun make(animal: T) {} // Type parameter T is declared as 'out' but occurs in 'in' position in type T
}

/**
 * 总结：
 * 1，私有方法的参数既不在in位置也不在out位置。变型规则只会防止外部使用者对类的误用但不会对类自己的实现起作用。
 */