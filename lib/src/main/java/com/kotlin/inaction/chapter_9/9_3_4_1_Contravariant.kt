package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    list.apply {
        add(1)
        add(4)
        add(2)
        add(3)
    }
    list.sortedWith(Comparator { o1, o2 -> o1.compareTo(o2) })


}