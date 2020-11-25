package com.kotlin.inaction.chapter_4

import java.io.File

/**
 *
 * @author wzc
 * @date 2019/1/27
 */
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File) : Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

}
/**
 * 总结：
 * 1，这是对象声明继承类和实现接口的例子，这里是创建了一个单例的 Comparator 对象，比较器。避免了多次创建对象的问题。
 * 2, 原来使用一个个对象的地方，现在直接使用单例就可以了。
 */