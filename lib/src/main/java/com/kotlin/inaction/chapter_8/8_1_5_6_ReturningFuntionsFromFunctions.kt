package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2022/1/12
 */

class Order3(val itemCount: Int) {
    fun calculateStandard(): Double {
        return  6 + 2.1 * itemCount
    }

    fun calculateExpedited(): Double {
        return 1.2 * itemCount
    }
}

// 这是声明一个返回函数类型的函数，返回的是计算运输费用的方式。
// 这里采用返回函数引用的写法
fun getShippingCostCalculator4(delivery: Delivery2): (Order3) -> Double {
    if (delivery == Delivery2.EXPEDITED) {
        return Order3::calculateExpedited
    }
    return Order3::calculateStandard
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator4(Delivery2.EXPEDITED)
    println("EXPEDITED Shipping costs ${calculator(Order3(3))}")
    val calculator1 = getShippingCostCalculator4(Delivery2.STANDARD)
    println("STANDARD Shipping costs ${calculator1(Order3(3))}")
}