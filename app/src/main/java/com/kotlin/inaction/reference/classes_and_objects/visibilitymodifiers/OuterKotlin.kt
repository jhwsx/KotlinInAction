package com.kotlin.inaction.reference.classes_and_objects.visibilitymodifiers

/**
 * 在 Kotlin 中，外部类不可以访问内部类的 private 变量
 * @author wangzhichao
 * @date 2019/09/24
 */
class OuterKotlin {
    fun method() {
        val inn = Inner()
        // val result = inn.number * 2 // 编译错误此行
    }

    class Inner {
        private val number = 1
    }
}