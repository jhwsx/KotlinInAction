package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/14
 */
data class Sir(val name: String,
               val age: Int? = null) { // age 有默认参数值 null
    fun isOlderThan(other: Sir) : Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        return age > other.age
    }
}

fun main(args: Array<String>) {
    val sam = Sir("Sam", 32)
    val john = Sir("John", 2)
    val peter = Sir("Peter")

    println(sam.isOlderThan(john))
    println(sam.isOlderThan(peter))

    val listOfInts = listOf(1,2,3)
}

/**
 * 总结：
 * 1，这一节学习可空的基本数据类型
 * 2，kotlin 的基本数据类型的可空版本，会被编译成 java 对应的包装类型，
 * 因为 null 不能存储在 java 的基本数据类型中，而只能存储在它的包装类型中。
 * 3，对于可空类型，它是可以为 null 的，要考虑到这种情况。
 */