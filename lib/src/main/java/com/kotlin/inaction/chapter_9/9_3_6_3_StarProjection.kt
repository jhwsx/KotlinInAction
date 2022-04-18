package com.kotlin.inaction.chapter_9

import java.lang.IllegalArgumentException
import java.lang.reflect.Field
import javax.xml.validation.Validator
import kotlin.reflect.KClass


/**
 *
 * @author wangzhichao
 * @since 2022/4/18
 */
interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty()
    }
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean {
        return input >= 0
    }

}

object Validators {
    private val validators =
        mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T: Any> registerValidator(
        kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException(
                "No validator for ${kClass.simpleName}")
}
fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator
    val fieldValidator: FieldValidator<*> = validators[String::class]!!
    // 编译器都不知道 fieldValidator 是哪种验证器，所以不能用这个验证器来验证字符串。
    // fieldValidator.validate("")

    // 解决办法1：使用显式地转换。这样不安全，不推荐。
    val stringValidator = fieldValidator as FieldValidator<String> // 警告：Unchecked cast: FieldValidator<*> to FieldValidator<String>
    println(stringValidator.validate(""))
    // 演示不安全
    val stringValidator2 = validators[Int::class] as FieldValidator<String>
    // stringValidator2.validate("") // 报错：java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Number

    // 解决办法2：使用 Validators
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    val strValidator: FieldValidator<String> = Validators[String::class]
    println(strValidator.validate("Kotlin"))
    val intValidator = Validators[Int::class]
    println(intValidator.validate(42))
}