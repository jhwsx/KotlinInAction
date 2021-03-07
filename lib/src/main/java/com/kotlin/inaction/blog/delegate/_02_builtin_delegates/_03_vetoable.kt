package com.kotlin.inaction.blog.delegate._02_builtin_delegates

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * veto 否决权
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Person2 {
    var address: String by Delegates.vetoable("") { property: KProperty<*>, oldValue: String, newValue: String ->
        // 返回 false，会被否决
        newValue.length > 7
    }
}

fun main() {
    val p = Person2()
    p.address = "Shanghai"
    println(p.address)
    p.address = "Beijing"
    println(p.address)

}