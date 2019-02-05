package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/2/1
 */
fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
        println("$prefix ${{message: String -> message}}")
    }
}
fun printGradesWithPrefix(grades: Collection<Int>, prefix: String) {
    grades.forEach {
        println(if (it > 90) "good: $it" else "not good: $it")
    }
}
fun main(args: Array<String>) {
    val errors = listOf<String>("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val grades = listOf(100, 50, 150)
    printGradesWithPrefix(grades, "")
}



/**
 * 总结：
 * 1，这个例子中，lambda 表达式作为实参，在 lambda 表达式里直接访问了 printMessagesWithPrefix 这个函数的参数
 * 2，这个例子展示的是在 lambda 中使用函数参数。
 */