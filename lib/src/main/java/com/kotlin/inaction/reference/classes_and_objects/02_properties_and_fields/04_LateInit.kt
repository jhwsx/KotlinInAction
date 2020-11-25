package com.kotlin.inaction.reference.classes_and_objects.`02_properties_and_fields`

/**
 * 学习 lateinit 的用法
 * @author wangzhichao
 * @date 2019/09/23
 */
data class Data(val str: String)

class Class1 {
    lateinit var data: Data
    // get() {} // lateinit modifier is not allowed on properties with a custom getter or setter

    private lateinit var str: String

    // private lateinit val s: String // lateinit modifier is allowed only on mutable properties

    // private lateinit var int: Int // lateinit modifier is not allowed on primitive type properties

    fun initData(data: Data) {
        this.data = data
    }

    fun initTopData(data: Data) {
        topData = data
    }

    fun initLocalData(data: Data) {
        lateinit var localData: Data
        localData = data
    }
}

lateinit var topData: Data

fun main(args: Array<String>) {
    println("topData isInitialized: ${::topData.isInitialized}")
}