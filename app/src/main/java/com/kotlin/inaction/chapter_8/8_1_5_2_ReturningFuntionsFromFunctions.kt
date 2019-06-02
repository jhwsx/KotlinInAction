package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
enum class Transportation { BUS, BIKE, CAR }

class Distance(val distance: Double)

fun getCostTimeCalculator(transportation: Transportation): (Distance) -> Double {
    when (transportation) {
        Transportation.BUS -> return {distance -> distance.distance / 50 }
        Transportation.BIKE -> return {distance -> distance.distance / 10 }
        Transportation.CAR -> return {distance -> distance.distance / 100 }
    }
}

fun main(args: Array<String>) {
    val costTimeCalculator = getCostTimeCalculator(Transportation.CAR)
    println("Car Transportation costs ${costTimeCalculator(Distance(3000.0))}")
}