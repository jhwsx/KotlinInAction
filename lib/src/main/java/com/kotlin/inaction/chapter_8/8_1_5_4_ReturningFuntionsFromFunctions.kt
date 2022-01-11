package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2022/1/12
 */
enum class Delivery2 { STANDARD, EXPEDITED }

class Order2(val itemCount: Int)

fun calculateStandard(order: Order2): Double {
    return  6 + 2.1 * order.itemCount
}

fun calculateExpedited(order: Order2): Double {
    return 1.2 * order.itemCount
}

// 这是声明一个返回函数类型的函数，返回的是计算运输费用的方式。
// 这里采用返回函数引用的写法
fun getShippingCostCalculator2(delivery: Delivery2): (Order2) -> Double {
    if (delivery == Delivery2.EXPEDITED) {
        return ::calculateExpedited
    }
    return ::calculateStandard
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator2(Delivery2.EXPEDITED)
    println("EXPEDITED Shipping costs ${calculator(Order2(3))}")
    val calculator1 = getShippingCostCalculator2(Delivery2.STANDARD)
    println("STANDARD Shipping costs ${calculator1(Order2(3))}")
}