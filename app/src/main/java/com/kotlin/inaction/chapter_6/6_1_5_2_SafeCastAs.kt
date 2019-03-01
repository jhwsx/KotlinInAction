package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/2
 */
class HumanBeing(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherHumanBeing = other as? HumanBeing ?: return false
        return otherHumanBeing.firstName == other.firstName &&
                otherHumanBeing.lastName == other.lastName
    }

    override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val h1 = HumanBeing("zhichao", "wang")
    val h2 = HumanBeing("zhichao", "wang")
    println(h1 == h2)

    println(h1.equals(42))
}
