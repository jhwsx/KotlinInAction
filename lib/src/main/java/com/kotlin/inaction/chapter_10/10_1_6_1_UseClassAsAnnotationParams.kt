package com.kotlin.inaction.chapter_10

import ru.yole.jkid.DeserializeInterface
import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize

/**
 *
 * @author wangzhichao
 * @since 2022/4/19
 */
interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class Person12(
    val name: String,
    // 在 JKid 库中，不能直接创建一个接口的实例，需要指定反序列化时哪个类作为实现被创建。
    // 不加会报错：ru.yole.jkid.deserialization.JKidException: Class com.kotlin.inaction.chapter_10.Company doesn't have a primary constructor
    @DeserializeInterface(CompanyImpl::class)
    val company: Company
)
/*
@Target(AnnotationTarget.PROPERTY)
annotation class DeserializeInterface(val targetClass: KClass<out Any>)
为什么要加 out 呢？
如果不加 out 的话，只允许 Any::class 作为实参；如果加上 out 的话，既可以传递 Any::class，也可以传递继承 Any 的类。
*/

fun main() {
    val person = Person12("willwaywang6", CompanyImpl("abup"))
    println(serialize(person))
    val json = """{"company": {"name": "abup"}, "name": "willwaywang6"}"""
    println(deserialize<Person12>(json))
}
/*
{"company": {"name": "abup"}, "name": "willwaywang6"}
Person12(name=willwaywang6, company=CompanyImpl(name=abup))
*/