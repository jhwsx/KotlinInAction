package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/14
 */
class Email

fun loadEmail(person: Person1): List<Email> {
    println("load emails for ${person.name}")
    return listOf()
}

class Person1(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmail(this)
            }
            return _emails!!
        }
}

fun main() {
    val p = Person1("wzc")
    p.emails
    p.emails
}

/**
 * 总结：
 * 1，支持属性的使用：emails 提供了一个 getter 方法，_emails 是存储值的属性;
 */