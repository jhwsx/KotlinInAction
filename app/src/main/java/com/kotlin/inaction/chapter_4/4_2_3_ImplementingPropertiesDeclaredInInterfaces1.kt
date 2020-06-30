package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/23
 */
interface User7 {
    val email: String // 抽象属性
    val nickname: String // 自定义 getter
        get() = email.substringBefore('@')
}

class User7Impl constructor(override val email: String) : User7 {

}
/**
 * 总结：
 * 1，抽象属性和自定义 getter 的区别是什么？
 * 抽象属性必须被子类重写，自定义 getter 可以被继承
 */