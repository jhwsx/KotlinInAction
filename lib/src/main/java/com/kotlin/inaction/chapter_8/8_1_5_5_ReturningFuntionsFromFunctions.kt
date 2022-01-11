package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2022/1/12
 */
fun Order2.calculateStandard(): Double {
    return  6 + 2.1 * itemCount
}

fun Order2.calculateExpedited(): Double {
    return 1.2 * itemCount
}

// 这是声明一个返回函数类型的函数，返回的是计算运输费用的方式。
// 这里采用返回带接收者的函数引用的写法
fun getShippingCostCalculator3(delivery: Delivery2): (Order2) -> Double {
    if (delivery == Delivery2.EXPEDITED) {
        return Order2::calculateExpedited
    }
    return Order2::calculateStandard
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator3(Delivery2.EXPEDITED)
    println("EXPEDITED Shipping costs ${calculator(Order2(3))}")
    val calculator1 = getShippingCostCalculator3(Delivery2.STANDARD)
    println("STANDARD Shipping costs ${calculator1(Order2(3))}")
}