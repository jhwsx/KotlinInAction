package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/6/11
 */
// 继承了泛型类或者实现了泛型接口，就需要为基础类型的泛型形参提供一个类型实参。
// 这个类型实参可以是具体类型，也可以是另一个类型形参。
interface MyList<T>: MutableList<T>

interface MyStringList : MutableList<String>

class Person(val name: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return if (age < other.age) -1 else if (age == other.age) 0 else 1
    }

}

/**
 * 总结：
 * 1，一个类可以把它自己作为类型实参引用。
 * 2，继承泛型类，或者实现了泛型接口的类，可以是具体类型或者是另一个类型形参。
 */
