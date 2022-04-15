package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

// 这是声明一个返回函数类型的函数，返回的是计算运输费用的方式。
fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 1.2 * order.itemCount } // 返回一个 lambda
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("EXPEDITED Shipping costs ${calculator(Order(3))}")
    val calculator1 = getShippingCostCalculator(Delivery.STANDARD)
    println("STANDARD Shipping costs ${calculator1(Order(3))}")
}