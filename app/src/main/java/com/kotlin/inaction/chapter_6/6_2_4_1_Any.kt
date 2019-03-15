package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/16
 */
fun main(args: Array<String>) {
    val answer: Any = 42
    println(answer)

//    val notNull : Any = null // 编译报错：Any 是非空类型
    val canNull: Any? = null

    val age: Any = 10
    val ageObj: Object = age as Object
    ageObj.wait()
    ageObj.notify()
    println(ageObj)
}

/**
 * 总结：
 * 1，kotlin 中的 Any 和 java 中的 Object 对比
 * 在 kotlin 中，Any 是所有类型的超类型，包括像 Int 那样的基本数据类型
 * 在 java 中，Object 只是所有引用类型的超类型，不包括基本数据类型
 *
 * 在底层，Any 类型对应于 java.lang.Object
 *
 * Any 中有 toString、equals、hashCode 三个方法，但没有 wait、notify 方法
 * 但可以手动把值转换成 java.lang.Object 来调用这些方法。
 */