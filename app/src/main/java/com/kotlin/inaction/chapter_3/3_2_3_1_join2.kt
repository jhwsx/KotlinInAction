@file:JvmName("StringFunctions")
package com.kotlin.inaction.chapter_3

/**
 *
 * @author wzc
 * @date 2019/1/12
 */
fun <T> joinToString5(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}