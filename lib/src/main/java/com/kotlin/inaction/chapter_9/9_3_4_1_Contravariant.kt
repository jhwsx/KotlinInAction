package com.kotlin.inaction.chapter_9

/**
 * 这个例子是逆变的准备了。
 * 逆变是协变的镜像：对一个逆变类来说，它的子类型化关系与用作类型实参的类的子类型化关系是相反的。
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
    // 泛型参数 T 只在 in 位置上使用。
    println(list.sortedWith(Comparator { o1, o2 -> o1.compareTo(o2) }))

    val anyComparator = Comparator<Any> { e1, e2 ->
        e1.hashCode() - e2.hashCode()
    }
    val strings: List<String> = listOf("abc", "efg", "acb")
    println(strings.sortedWith(anyComparator))

    // 不加 in 是不行的。
    val stringComparator: Comparator<in String> = anyComparator
}
/*
Comparator<in T> 相当于 Java 的 Comparator<? super T>
对比 Java 的实现版本：Test_TypeParametersContravariant 类。
public fun <T> Iterable<T>.sortedWith(comparator: Comparator<in T>): List<T>
*/