package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/9
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val newList = list.filter { it % 2 == 0 }
    println("list=${list.hashCode()}, newList=${newList.hashCode()}")
    println(newList)

    val newList2 = list.myfilter { it % 2 == 0 }
    println("list=${list.hashCode()}, newList2=${newList2.hashCode()}")
    println(newList2)
}

fun <T> Iterable<T>.myfilter(predicate: (T)-> Boolean): List<T> {
    val result = ArrayList<T>()
    for (t in this) {
        if (predicate(t)) {
            result.add(t)
        }
    }
    return result
}

/**
 * 总结：
 * 1，集合中的 filter 函数：遍历集合并选出应用给定 lambda 后并返回符合条件的元素集合；
 * 2，注意：是返回一个新的集合，跟旧的集合是没有关系的。
 */