package com.kotlin.inaction.blog.delegate._01_delegating_delegates_to_kotlin._01_class_delegates

/**
 * The Kotlin compiler uses another design pattern called the Decorator Pattern to support class delegation in the generated code.
 *
 * Delegates are especially useful when you can’t inherit from a particular class. With class delegation,
 * your class is not part of any class hierarchy. Instead, it shares the same interface and decorates the
 * internal object of the original type. This means you can easily switch the implementation without breaking the public API.
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class ListWithTrash<T>(private val innerList: MutableList<T> = ArrayList()
// by 关键字告诉 Kotlin 去把来自 MutableList 的功能委托给内部的 ArrayList 实例
) : MutableList<T> by innerList {
    var deletedItem: T? = null
    override fun remove(element: T): Boolean {
        deletedItem = element
        return innerList.remove(element)
    }

    fun recover(): T? {
        return deletedItem
    }
}