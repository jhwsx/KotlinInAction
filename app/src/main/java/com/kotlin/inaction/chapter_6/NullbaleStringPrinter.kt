package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/13
 */
class NullbaleStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        }
    }
}