package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/29
 */
class Person1(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String) : Person1 {
//            val jsonObject = JSONObject(jsonText)
//            val name = jsonObject.getString("name")
            return Person1("person")
        }
    }
}

fun main(args: Array<String>) {
    val person1 = Person1.Loader.fromJSON("{name: 'Peter'}")
    println(person1.name)

    val person11 = Person1.fromJSON("{name: 'May'}")
    println(person11.name)
}

/**
 * 总结：
 * 1，伴生对象是什么？就是一个声明在类中的普通对象；
 * 2，伴生对象可以有名字
 * 3，在大多数情况下，通过包含伴生对象的类的名字来引用伴生对象，
 * 4，如果省略了伴生对象的名字，默认的名字是 Companion。
 */