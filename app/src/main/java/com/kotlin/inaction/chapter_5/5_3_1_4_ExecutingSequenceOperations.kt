package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/14
 */
fun main(args: Array<String>) {
   val people = listOf<Person>(
       Person("Alice",29),
       Person("Bob",31),
       Person("Charles",31),
       Person("Dan",21)
   )
    // 先 map 再 filter，需要执行 4 次map，4 次filter
    println(people.asSequence().map(Person::name)
        .filter { it.length < 4 }.toList()
    )
    // 先 filter 再 map，需要执行 4 次filter，2 次map
    println(people.asSequence().filter { it.name.length < 4 }
        .map(Person::name).toList())
}

/**
 * 总结：
 * 1, 在集合上执行操作的顺序也会影响性能；
 * 2，Kotlin 中的序列就是 Java8 中流的翻版，但是 Java8 的流不支持那些基于 Java 老版本的平台。
 */