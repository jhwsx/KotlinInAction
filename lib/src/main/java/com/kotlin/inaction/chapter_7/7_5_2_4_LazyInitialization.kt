package com.kotlin.inaction.chapter_7

/**
 * 展示 lazy 函数使用 LazyThreadSafetyMode.PUBLICATION 的情形
 *
 * [SafePublicationLazyImpl] 是使用 AtomicReferenceFieldUpdater 来保证 _value 的原子性操作。
 *
 * [SafePublicationLazyImpl] 支持同时多个线程调用，并且可以在全部或部分线程上同时进行初始化。但是，如果某个值已由另一个线程初始化，则将返回该值而不执行初始化。
 *
 * 参考文章：https://cloud.tencent.com/developer/article/1400441
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Email3

fun loadEmail3(person: Person4): List<Email3> {
    println("load emails 3 for ${person.name}")
    Thread.sleep(1000L)
    return listOf()
}

class Person4(val name: String) {
    val emails by lazy(mode = LazyThreadSafetyMode.PUBLICATION) { loadEmail3(this) }
}

fun main() {
    val p = Person4("wzc")
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

/*
打印结果：
thread=Thread-0
load emails 3 for wzc
thread=Thread-1
load emails 3 for wzc
 */