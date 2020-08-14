package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/6
 */
// :: 是一个运算符，它的作用是把函数转换成一个对象，这样才可以传递它。
val getAge: (Person) -> Int = Person::age

val getAge2 = { person: Person -> person.age }

val getAge3 = fun (person: Person): Int {
    return person.age
}
// 错误写法示范：
//val getAge31 = fun name(person: Person): Int { // Anonymous functions with names are prohibited
//    return person.age
//}

val getAge4 = object: Function1<Person, Int> {
    override fun invoke(person: Person): Int {
        return person.age
    }

}
fun main(args: Array<String>) {
    println("getAge=$getAge") // getAge=property age (Kotlin reflection is not available)
    println("getAge2=$getAge2") // getAge2=Function1<com.kotlin.inaction.chapter_5.Person, java.lang.Integer>
    println("getAge3=$getAge3") // getAge3=Function1<com.kotlin.inaction.chapter_5.Person, java.lang.Integer>
    println("getAge4=$getAge4") // getAge4=com.kotlin.inaction.chapter_5._5_1_5_1_MemberReferencesKt$getAge4$1@681a9515


    println(getAge(Person("wzj", 31)))
    println(getAge2(Person("wzj", 31)))
    println(getAge3(Person("wzj", 31)))
    println(getAge3(Person("wzj", 31)))
    println("********************************************")
    println(getAge.invoke(Person("wzj", 31)))
    println(getAge2.invoke(Person("wzj", 31)))
    println(getAge3.invoke(Person("wzj", 31)))
    println(getAge3.invoke(Person("wzj", 31)))

    val people = listOf(
        Person("wzc", 30),
        Person("wcg", 6),
        Person("wcx", 2)
    )
    println(people.maxBy(getAge))

    println(people.maxBy(getAge2))

    println(people.maxBy(getAge3))

    println(people.maxBy(getAge4))
}

inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var maxElem = iterator.next()
    if (!iterator.hasNext()) return maxElem
    var maxValue = selector(maxElem)
    do {
        val e = iterator.next()
        val v = selector(e)
        if (maxValue < v) {
            maxElem = e
            maxValue = v
        }
    } while (iterator.hasNext())
    return maxElem
}

/**
 * 总结：
 * 1，传递已经被定义成了函数的代码块，使用成员引用：把函数转换成一个值，就可以传递了，使用 :: 运算符。
 * 双引号把类名称和要引用的成员名称隔开
 *
 */