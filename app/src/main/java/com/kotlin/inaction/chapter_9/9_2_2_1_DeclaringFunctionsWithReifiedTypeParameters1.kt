package com.kotlin.inaction.chapter_9

/**
 *
 * @author wzc
 * @date 2019/8/7
 */
//fun <T> isA(value: Any) = value is T // 后面的 T 编译报错：Cannot check for instance of erased type: T

/**
 * 总结：
 * 1，这个例子展示：在调用泛型函数的时候，在函数体中不能决定调用它用的类型实参。
 */