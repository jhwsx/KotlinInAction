package com.kotlin.inaction.chapter_7

/**
 *
 * @author wzc
 * @date 2019/4/3
 */
class Point5(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is Point5) {
            return false
        }
        return other.x == x && other.y == y
    }
}

fun main(args: Array<String>) {
    println(Point5(10, 20) == Point5(10, 20))

    println(Point5(10, 20) == Point5(5, 5))

    println(Point5(10, 20) == null)
}

/**
 * 总结：
 * 1，kotlin 中的 === 和 java 中的 == 是完全相同的，检查两个参数是否是同一个对象的引用。
 * 2，kotlin 中的 === 不能被重载；
 * 3，kotlin 中的 == 和 java 中的 equals 类似，但还不太一样
 * a == b，等价于 a?.equals(b) ?: (b == null)
 * a 安全调用 equals，若 a 是 null，那么就看 b 是不是 null，b 是 null，返回相等，b 不是 null，
 * 返回不相等；若 a 不是 null，则和 b 进行 equals 比较
 * 4，!= 也会转换为 equals 方法的调用。
 */