package com.kotlin.inaction.reference.classes_and_objects.`03_interfaces`

/**
 * @author wangzhichao
 * @date 2019/09/23
 */
interface MyInterface {
    fun method1() // 抽象方法
    fun method2() { // 非抽象方法

    }
    // var x: Int = 5 // Property initializers are not allowed in interfaces

    val y: Int // 抽象属性

    val z: Int
        get() = 5 // 有自定义访问器的属性
}

abstract class MyAbastractClass {
    abstract fun method1() // 抽象方法
    fun method2() { // 非抽象方法

    }
     var x: Int = 5
}

class MyInterfaceImpl(override val y: Int) : MyInterface {
    override fun method1() {

    }

}

object MyObject : MyInterface {
    override val y: Int
        get() = 6

    override fun method1() {

    }

}
/**
 * 总结：
 * 1，接口和抽象类的区别：
 * 接口不可以保存状态，而抽象类是可以保存状态的
 * 2，接口中的属性一定没有支持字段
 */