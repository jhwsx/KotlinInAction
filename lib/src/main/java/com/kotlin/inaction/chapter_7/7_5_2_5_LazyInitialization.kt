package com.kotlin.inaction.chapter_7

/**
 * 展示 lazy 函数使用 SynchronizedLazyImpl, 用开发者自己指定锁 的情形
 *
 * 参考文章：https://cloud.tencent.com/developer/article/1400441
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Email4

val lock = Any()
fun loadEmail4(person: Person5): List<Email4> {
    println("load emails 4 for ${person.name}")
    Thread.sleep(1000L)
    return listOf()
}

class Person5(val name: String) {
    val emails by lazy(lock = lock) { loadEmail4(this) }
}

fun main() {
    val p = Person5("wzc")
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
load emails 4 for wzc
thread=Thread-1
 */