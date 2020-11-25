package com.kotlin.inaction.chapter_7

/**
 * 类代理
 * https://medium.com/androiddevelopers/delegating-delegates-to-kotlin-ee0a0b21c52b
 * 反编译的代码里用到了装饰器模式
 *
 * @author wangzhichao
 * @date 20-11-13
 */
class ListWithTrash<T>(
        private val innerList: MutableList<T> = ArrayList<T>()
) : MutableCollection<T> by innerList {
    var deletedItem: T? = null
    override fun remove(element: T): Boolean {
        deletedItem = element
        return innerList.remove(element)
    }

    fun recover(): T? {
        return deletedItem
    }
}