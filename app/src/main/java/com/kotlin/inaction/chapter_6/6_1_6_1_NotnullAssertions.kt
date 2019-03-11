package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/12
 */
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls("wzc")
    ignoreNulls(null)
}

/**
 * 总结：
 * 1，非空断言：!!, 如果值不为 null，那么还是它自己，如果值是 null，那么就会抛出 NPE 异常;
 * 2, 需要注意的是 kotlin 是在运行时抛出异常，而不是在编译期有任何提醒；
 */