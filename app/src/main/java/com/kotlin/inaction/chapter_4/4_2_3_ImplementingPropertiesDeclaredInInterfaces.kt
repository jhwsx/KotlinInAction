package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/23
 */
fun getFacebookName(accountId: Int) = "fb: $accountId"

interface User4 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User4

class SubscribingUser(val email: String) : User4 {
    override val nickname: String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User4 {
    override val nickname: String = getFacebookName(accountId)
}

/**
 * 总结：
 * 1，kotlin可以在接口中声明属性，但是只是提供一个取得属性值得接口而已；
 * 2，kotlin中的接口并没有说明这个值该存储到一个字段还是通过getter获取；
 * 3，kotlin中的接口本身并不包括任何状态；
 * 4，自定义 getter 和属性初始化的区别：有没有一个支持字段存在。
 */