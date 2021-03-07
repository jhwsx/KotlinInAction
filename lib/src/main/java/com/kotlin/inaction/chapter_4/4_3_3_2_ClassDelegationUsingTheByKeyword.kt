package com.kotlin.inaction.chapter_4

/**
 * 类委托，使用 by 关键字
 *
 * @author wzc
 * @date 2019/1/26
 */
class CountingSet<T>(
        private val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        println("add")
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        println("addAll")
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1,1,2))
    cset.add(4)
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}

/**
 * 总结：
 * 1，不使用委托，提供一个不同的实现
 */
