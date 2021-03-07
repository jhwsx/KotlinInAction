package com.kotlin.inaction.chapter_7

/**
 * 展示 lazy 函数不使用锁的情形
 *
 * 不使用锁，线程安全也无法保证了。
 *
 * 参考文章：https://cloud.tencent.com/developer/article/1400441
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Email2

fun loadEmail2(person: Person3): List<Email2> {
    println("load emails for ${person.name}")
    Thread.sleep(1000L)
    return listOf()
}

class Person3(val name: String) {
    val emails by lazy(mode = LazyThreadSafetyMode.NONE) { loadEmail2(this) }
}

fun main() {
    val p = Person3("wzc")
    Thread {
        println("thread=${Thread.currentThread().name}")
        p.emails
        p.emails
    }.start()

    Thread {
        println("thread=${Thread.currentThread().name}")
        p.emails
        p.emails
    }.start()
}