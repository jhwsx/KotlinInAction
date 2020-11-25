package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/13
 */


fun saveUser4(user: User) {
    fun User.validateBeforeSave() {
        fun validate(
            value: String,
            fieldName: String
        ) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                    "Can't save user ${id}: empty $fieldName"
                )
            }
        }

        validate(name, "Name")
        validate(address, "Address")
    }
    user.validateBeforeSave()
}
fun main(args: Array<String>) {
    saveUser4(User(1, "",""))
}

/**
 * 总结：
 * 1，扩展函数的使用
 */