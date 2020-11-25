package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/26
 */
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("wzc")
    printAllCaps(null)
}

/**
 * 总结：
 * 1，学习安全调用运算符：?.
 * 2，上面的代码中：s?.toUpperCase()里用到了安全调用运算符，等价于 java 的
 * if (s != null) s.toUpperCase() else null
 * 3, 应该注意的是即便是运用了安全调用运算符，结果也可能是 null 的。
 */