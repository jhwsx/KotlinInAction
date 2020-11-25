package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {
    { println(42) }();

    {}();

    {}
}

/**
 * 总结：
 * 1，直接调用 lambda 表达式；
 * 2，理解：println(42) 是箭头右边的部分，箭头左边的部分是没有的，箭头也是没有的
 * 3, 后面的括号是什么作用呢？
 */