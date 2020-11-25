package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/20
 */
class User constructor(_nickname: String) { // 带一个参数的主构造方法
    val nickname: String

    init { // 初始化代码块
        nickname = _nickname
    }
}

class User1 constructor(_nickname: String) {
    val nickname = _nickname // 不使用初始化代码块，用参数来初始化属性
}

class User2(_nickname: String) { // 去掉 constructor 关键字，因为这里主构造方法没有注解或可见性修饰符
    val nickname = _nickname
}

class User3(val nickname: String) // val 表示相应的属性会用构造方法的参数来初始化

/**
 * 总结：
 * 1，看一下 User 类是如何一步一步进行简化的
 */



