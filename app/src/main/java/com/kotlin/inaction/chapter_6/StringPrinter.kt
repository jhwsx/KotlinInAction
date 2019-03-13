package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
class StringPrinter : StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}