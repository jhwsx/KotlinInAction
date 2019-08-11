package com.kotlin.inaction.chapter_9

import java.util.*

/**
 *
 * @author wzc
 * @date 2019/8/11
 */
data class Service(val name: String)

fun main(args: Array<String>) {
    val serviceImpl = ServiceLoader.load(Service::class.java)

    val serviceImpl1 = loadService<Service>()
}

inline fun <reified T> loadService() : ServiceLoader<T>{
    return ServiceLoader.load(T::class.java)
}

