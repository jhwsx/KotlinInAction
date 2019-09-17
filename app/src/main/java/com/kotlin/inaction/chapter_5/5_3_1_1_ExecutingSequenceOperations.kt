package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/13
 */
fun main(args: Array<String>) {
    val people = listOf<Person>(
        Person("Alice", 29),
        Person("Bob", 31)
    )
    val asSequence = people.asSequence()
    println(asSequence.hashCode())
    val map = asSequence.map(Person::name)
    println(map.hashCode())
    val filter = map.filter { it.startsWith("A") }
    println(filter.hashCode())
    println(filter.toList())

    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList())

}

/**
 * 总结：
 * 1，Sequence 接口是 Kotlin 惰性集合操作的入口；
 * 2，序列中的元素求值是惰性的，可以使用序列更高效地对集合元素执行链式操作，而不需要
 * 创建额外的集合来保存过程中产生的中间结果；
 * 3，可以调用扩展函数 asSequence 把任意集合转换成序列，调用 toList 来做反向的转换。
 */