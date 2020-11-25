package com.kotlin.inaction.reference.getting_started.`02_idioms`

/**
 * @author wangzhichao
 * @date 2019/09/10
 */
data class Customer(val name: String, val email: String)

data class Customer2(val name: String) {
    val email: String = ""
}
class Customer1(val name: String, val email: String)

fun main(args: Array<String>) {
    val customer = Customer("wzc", "willwaywang6@gmail.com")
    println("name=${customer.name}, email=${customer.email}")
    println("name=${customer.component1()},email=${customer.component2()}")
    println("toString:${customer.toString()}")
    println("hashCode:${customer.hashCode()}")
    val copy = customer.copy("wzj")
    println("$copy, hashCode=${copy.hashCode()}")
    val copy1 = customer.copy(email = "392337950@qq.com")
    println("$copy1, hashCode=${copy1.hashCode()}")
    val copy2 = customer.copy()
    println("$copy2, hashCode=${copy2.hashCode()}")

}
/**
 * 总结：
 * 1，data 类和普通 类的区别：
 * 普通类只有 getter 和 setter 方法；
 * 而 data 类还有 component1(), component2(), toString(). hashCode(), equals(), copy(),但是需要注意这些方法都是和
 * 主构造方法里的属性相关的。
 */