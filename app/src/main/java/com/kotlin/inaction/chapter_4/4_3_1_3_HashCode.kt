package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/26
 */
class Client2(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client2) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString(): String {
        return "Client2{name=$name, postalCode=$postalCode}"
    }

    override fun hashCode(): Int {
        return name.hashCode() *31 + postalCode
    }

}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client2("wzc", 12345))
    println(processed.contains(Client2("wzc", 12345)))
}

/**
 * 总结：
 * 1，在 hashset 中，去除相同的元素，必须重写元素的 hashCode() 和 equals() 方法：
 * hashCode() : 使属性值相同的对象的返回值必须相同，属性值不同的对象的返回值尽量不同，
 * 哈希算法提高了去重的效率，降低了equalsff 执行的次数；
 * equals() : 对 hashCode() 相同的对象，利用 equals 方法逐个比较属性值。
 */