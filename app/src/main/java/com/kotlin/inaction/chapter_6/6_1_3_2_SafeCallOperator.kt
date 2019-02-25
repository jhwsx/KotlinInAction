package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/26
 */
class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

fun main(args: Array<String>) {
    val ceo = Employee("SunRongWei", null)
    val cto = Employee("ZhangBo", ceo)
    println(managerName(ceo))
    println(managerName(cto))
}

/**
 * 总结：
 * 1，使用安全调用运算符处理可空属性
 * 2，employee.manager?.name 等价于 java 的代码
 * if (employee.manager != null) employee.manager.name else null
 */
