package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/22
 */
open class User6(val nickname: String)

class TwitterUser(nickname: String) : User6(nickname)

fun main(args: Array<String>) {
    val twitterUser = TwitterUser("alex")
    println(twitterUser.nickname)
}

/**
 * 总结：
 * 1，自己的类有一个父类，那么需要在这个类的主构造方法中初始化父类：
 * 方法是在基类列表的父类引用中提供父类构造方法参数
 */