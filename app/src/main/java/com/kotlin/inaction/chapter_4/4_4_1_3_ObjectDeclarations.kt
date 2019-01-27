package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/27
 */
data class Boy(val name: String) {
    object NameComparator : Comparator<Boy> {
        override fun compare(boy1: Boy, boy2: Boy): Int {
            return boy1.name.compareTo(boy2.name)
        }
    }
}

fun main(args: Array<String>) {
    val boys = listOf<Boy>(Boy("Peter"), Boy("Bush"), Boy("Obama"))
    println(boys.sortedWith(Boy.NameComparator))
}


/**
 * 总结：
 * 1，在类中使用对象声明的例子.
 */
