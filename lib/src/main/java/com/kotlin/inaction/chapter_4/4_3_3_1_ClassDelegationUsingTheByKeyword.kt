package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/26
 */
class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int = innerList.size
    override fun isEmpty() : Boolean = innerList.isEmpty()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

class DelegatingCollection1<T>(
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {}

/**
 * 总结：
 * 1，使用 by 关键字，将接口的实现委托到另一个对象。
 * 2，kotlin 通过 by 关键字，省去开发人员实现委托的代码。
 */