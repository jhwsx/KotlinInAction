package com.kotlin.inaction.reference.classes_and_objects.`02_properties_and_fields`

/**
 * https://ebnbin.com/2017/11/06/kotlin-getter-setter/
 */
class Person {
    // var 声明的属性自带 getter 和 setter
    var name: String = "wzc"
    var age = 18
        set(value) {
            if (value > 0) {
                field = value
            }
        }
//    var gender: Boolean // 必须被初始化

    // val 声明的属性只有 getter 而没有 setter
    val salary = 200

    // val 声明一个属性，定义自定义访问器 getter
    val isAdult: Boolean
        get() = age >= 18
    // address 的 getter 和 setter 写不写是一样的
    var address: String = "Henan"
        get() = field
        set(value) {
            field = value
        }
    // job 的 getter 写不写是一样的
    val job: String = "coder"
        get() = field

    var isMarried: Boolean
        get() = false
        set(value) {
            println(value)
        }

    var mobile = "12345678901"
        private set

    fun change() {
        name = "wzj" // 调用 setter 方法
        age = 19
    }

    fun show() {
        println(name) // 调用 getter 方法
        println(age)
    }
}


fun main(args: Array<String>) {
    val person = Person()
    person.show()
    person.change()
    person.show()
    println(person.salary)
//    person.salary = 20000

    println(person.isAdult)
//    person.isAdult = true

    println(person.address)

    println("isMarried=${person.isMarried}")

    person.isMarried = true

    println("isMarried=${person.isMarried}")

    println("mobile=${person.mobile}")

//    person.mobile = 0
}

