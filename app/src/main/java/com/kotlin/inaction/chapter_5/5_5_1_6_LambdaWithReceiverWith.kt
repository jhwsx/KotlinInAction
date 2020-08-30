package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
class OuterClass {
    inner class InnerClass {
        val list = listOf(1, 2, 3, 4)
        fun print() {
            with(list) {
                // 打算调用外部类的 toString() 方法，所以这里加上标签。
                this@OuterClass.toString()
            }
        }

        override fun toString(): String {
            println("InnerClass toString")
            return ""
        }
    }

    override fun toString(): String {
        println("OuterClass toString")
        return ""
    }
}
fun main(args: Array<String>) {
    OuterClass().InnerClass().print()
}

/**
 * 总结：
 * 1, 使用标签来解决方法名称冲突
 */