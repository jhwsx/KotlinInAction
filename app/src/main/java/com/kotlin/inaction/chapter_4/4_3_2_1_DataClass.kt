package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/26
 */
data class Client3(val name: String, val postalCode: Int)

class Client4(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client4) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode.hashCode()
    }

    override fun toString(): String {
        return "Client4{name=$name, postalCode=$postalCode}"
    }
}

/**
 * 总结：
 * 1，在 class 前面加一个 data ，kotlin 就重写了所有标准 java 的方法：equals，toString，hashCode，
 * 但不止这些。如还有 copy 方法。
 */