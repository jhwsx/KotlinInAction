package com.kotlin.inaction.chapter_8

/**
 *
 * @author wzc
 * @date 2019/6/2
 */
data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return { startsWithPrefix(it) }
//            return startsWithPrefix // 这两行都可以
        }
        return {
            startsWithPrefix(it)
                    && it.phoneNumber != null
        }
    }
}

fun main(args: Array<String>) {
    val contacts = listOf(
        Person("zhichao", "wang", "123456789"),
        Person("zhijie", "wang", "987654321"),
        Person("hongli", "wang", "")
    )
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "zhi"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}

/**
 * 总结：
 * 1，使用一个函数来创建一个判断式
 */