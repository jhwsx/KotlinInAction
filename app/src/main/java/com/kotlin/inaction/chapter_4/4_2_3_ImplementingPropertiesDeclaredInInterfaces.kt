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

class PrivateUser(override val nickname: String) : User4 // 这里有个 override

class SubscribingUser(val email: String) : User4 {
    override val nickname: String // 这是自定义 getter 的方式，没有存储值。
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User4 {
    override val nickname: String = getFacebookName(accountId) // 这是支持字段的方式，有存储值
}

/**
 * 总结：
 * 1，kotlin可以在接口中声明属性，但是只是提供一个取得属性值得接口而已；
 * 2，kotlin中的接口并没有说明这个值该存储到一个支持字段还是通过getter获取；
 * 3，kotlin中的接口本身并不包括任何状态，只有在实现这个接口的类在需要的情况下才会存储这个值，
 * 也就是说即便是实现类，也不一定非要存储这个值；
 * 4，自定义 getter 和属性初始化的区别：有没有一个支持字段存在。
 */