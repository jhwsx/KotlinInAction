package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
class User10 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User10(email.substringBefore('@'))

        fun newFacebookUser(accountId : Int) =
                User10(getFacebookName(accountId))
    }

}

fun main(args: Array<String>) {
    val subscribingUser = User10.newSubscribingUser("willwaywang6@gmail.com")
    val facebookUser = User10.newFacebookUser(4)

    println(subscribingUser)
    println(facebookUser)
}
/**
 * 总结：
 * 1，伴生对象的使用：使用工厂方法来创建类实例；
 * 2，使用工厂方法来创建类实例 vs 使用多个构造方法来创建类实例
 * 使用工厂方法来创建类实例，可以根据它们的用途来命名，上面的例子可以看出这一点
 * 使用工厂方法来创建类实例，能够返回声明这个方法的类的子类
 * 使用工厂方法来创建类实例，可以在不需要的时候避免创建新的对象。
 * 但是，伴生对象成员在子类中不能被重写，所以不适合需要扩展的类。
 */