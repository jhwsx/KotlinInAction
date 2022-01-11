package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2022/1/12
 */

class Order4(val itemCount: Int) {
    companion object {
        fun calculateStandard(order: Order4): Double {
            return  6 + 2.1 * order.itemCount
        }

        fun calculateExpedited(order: Order4): Double {
            return 1.2 * order.itemCount
        }
    }
}

// 这是声明一个返回函数类型的函数，返回的是计算运输费用的方式。
// 这里采用返回函数引用的写法
fun getShippingCostCalculator5(delivery: Delivery2): (Order4) -> Double {
    if (delivery == Delivery2.EXPEDITED) {
        return Order4.Companion::calculateExpedited
    }
    return Order4.Companion::calculateStandard
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator5(Delivery2.EXPEDITED)
    println("EXPEDITED Shipping costs ${calculator(Order4(3))}")
    val calculator1 = getShippingCostCalculator5(Delivery2.STANDARD)
    println("STANDARD Shipping costs ${calculator1(Order4(3))}")
}