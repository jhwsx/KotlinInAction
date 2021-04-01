package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/17
 */
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
//    fail("Error occured")

    val firm = Firm("wzc", null)
    val location1 = firm.location ?: throw IllegalStateException("location is null") // location1 推断为 Location 类型
    val location2 = firm.location ?: flunk() // location2 推断为 Any 类型，因为 Location 类型和 Unit 类型的共同父类是 Any 类型
    val location3 = firm.location ?: fail("location is null") // location3 推断为 Location 类型
    println(location3.city)
}

private fun flunk() {
    throw IllegalStateException("location is null")
}

/**
 * 总结：
 * 1，Nothing 类型没有任何值，查看一下看见 Nothing 是一个默认构造被私有化的类；
 * 2，Nothing 的用处：当做函数返回值，表示函数永远不会正常终止；
 * 当作泛型函数返回值的类型参数。
 * 3，对比一下：flunk() 和 fail() 方法，因为它们的返回值不同，造成了 location2 和 location3 它们类型推断也不一样。
 */