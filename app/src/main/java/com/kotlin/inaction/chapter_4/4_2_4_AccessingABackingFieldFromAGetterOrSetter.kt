package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/24
 */
class User8 constructor(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
            Address was changed for $name:
            "$field" -> "$value".""".trimIndent()
            )

            field = value // 更新支持字段的值
        }
}

class Student constructor(val name: String) {
    var grades: Int = 0
        set(value: Int) {
            println(
                """
            Student "$name"'s grades is $value""".trimIndent()
            )
            field = value
        }
}

class Teacher constructor(val name: String) {
    val age: Int
        get() {
            return 1
        }
}

class Book constructor(val name: String) {
    var price: Float = 0f
    get() {return 100F}

}
fun main(args: Array<String>) {
    val user = User8("Alice")
    user.address = "Elseheimerstrasse 47, 80687 Muenchen"
    println(user.address)

    val student = Student("Peter")
    student.grades = 100
    println(student.grades)
}

/**
 * 总结：
 * 1，这是一个既可以存储值又可以在值被访问和修改时提供额外逻辑的属性的例子。
 * 2，setter 函数被重新定义了，使用了特殊的标识符 field 来访问支持字段的值；
 * 3，在 getter 中只能读取值；在 setter 中，既能读取它也能修改它；
 * 4，有支持字段的属性和没有支持字段的属性有什么区别？
 * 如果显式地引用或者使用默认的访问器实现，编译器会为属性生成支持字段，
 * 如果提供了一个自定义的访问器实现并且没有使用field，支持字段不会被呈现出来。
 */
