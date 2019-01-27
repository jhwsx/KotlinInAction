package com.kotlin.inaction.chapter_4


/**
 *
 * @author wzc
 * @date 2019/1/27
 */
class Person(val name: String, val id: Int, val salary: Float)

object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary(): Float {
        var result: Float = 0F
        for (person in allEmployees) {
            result += person.salary
        }
        return result
    }
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("name1", 1, 10000F))
    Payroll.allEmployees.add(Person("name2", 2, 20000F))
    println(Payroll.calculateSalary())

}

/**
 * 总结：
 * 1，使用对象声明将类声明与该类的单一实例声明结合在一起，使用关键字 object;
 * 2, 注意，object 后不再加 class 了；
 * 3，对象声明与普通类的实例有什么区别？
 * 对象声明不允许有构造方法（包括主构造方法和从构造方法），这是唯一的不同
 */