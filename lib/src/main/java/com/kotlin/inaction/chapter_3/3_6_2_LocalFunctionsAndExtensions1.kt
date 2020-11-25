package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */
fun saveUser1(user: User) {
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user,user.name, "Name")
    validate(user,user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser1(User(1,"",""))
}