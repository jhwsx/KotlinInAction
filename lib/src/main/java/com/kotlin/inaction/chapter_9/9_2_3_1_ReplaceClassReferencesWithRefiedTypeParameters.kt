package com.kotlin.inaction.chapter_9

import com.kotlin.inaction.services.Service
import java.util.*

/**
 *
 * @author wzc
 * @date 2019/8/11
 */
fun main(args: Array<String>) {
    // SPI 的使用，参考：
    // https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html
    // https://www.cnblogs.com/sparkbj/articles/6208328.html
    // 这是使用 JDK 中的原有 load 方法的
    val serviceImpl = ServiceLoader.load(Service::class.java)
    println(serviceImpl)
    serviceImpl.forEach {
        it.doSomething()
    }
    // 这是使用 Kotlin 中的实化类型实参的 loadService 方法的
    val serviceImpl1 = loadService<Service>()
    println(serviceImpl1)
    serviceImpl1.forEach {
        it.doSomething()
    }
}

inline fun <reified T> loadService(): ServiceLoader<T> {
    return ServiceLoader.load(T::class.java)
}

//inline fun <reified T : Activity> Context.startActivity() {
//    val intent = Intent(this, T::class.java)
//    startActivity(intent)
//}

/*
java.util.ServiceLoader[com.kotlin.inaction.services.Service]
ServiceImpl1 doSomething
ServiceImpl2 doSomething
java.util.ServiceLoader[com.kotlin.inaction.services.Service]
ServiceImpl1 doSomething
ServiceImpl2 doSomething
 */

/**
 * 总结：
 * 1，SPI Service Provider Interfaces
 */