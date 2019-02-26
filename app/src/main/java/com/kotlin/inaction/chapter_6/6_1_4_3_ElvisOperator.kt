package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/27
 */
class Location(val streetAddress: String, val zipCode: Int,
               val city: String, val country: String)

class Firm(val name: String, val location: Location?)

class Human(val name: String, val firm: Firm?)

fun printShippingLabel(human: Human) {
    val location = human.firm?.location
        ?: throw IllegalArgumentException("No address")
    with(location) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    val location = Location("博云路2号", 1020, "Shanghai", "China")
    val firm = Firm("Adups", location)
    val human = Human("wangzhichao",firm)
    printShippingLabel(human)

    printShippingLabel(Human("wangchongxuan", null))
}

/**
 * 总结：
 * 1，同时使用 throw 和 Elvis 运算符的例子。
 */