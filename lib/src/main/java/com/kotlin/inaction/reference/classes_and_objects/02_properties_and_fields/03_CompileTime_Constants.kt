package com.kotlin.inaction.reference.classes_and_objects.`02_properties_and_fields`

const val APP = "app" // 常量定义的位置：顶层属性，对象声明的成员，伴生对象的成员

object Singleton {
    const val TAG = "Singleton"
    const val INTERVAL = 5000L
//    const val NUMBER = Math.random() // 常量只能由 String 或 基本类型来初始化
}

class Demo {
    companion object {
        const val TAG = "Demo"
//                const val INTERVAL = 2000L
//        get() = 3 // 不允许有自定义的 getter
        const val NAME = "wzc"
//        get() = field // 常量不允许有 getter
    }
}