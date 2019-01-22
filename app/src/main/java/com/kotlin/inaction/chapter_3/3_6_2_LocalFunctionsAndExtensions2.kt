package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun saveUser2(user: User) {
    fun validate(
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser1(User(1, "", ""))
}

/**
 * 总结：
 * 1，在局部函数中访问外层函数的参数，局部函数可以访问所在函数的所有参数和变量
 */