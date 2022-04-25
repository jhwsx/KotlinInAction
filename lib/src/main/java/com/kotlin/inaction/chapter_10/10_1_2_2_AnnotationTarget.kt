package com.kotlin.inaction.chapter_10

/**
 * 用注解控制 Java API
 * 这些注解可以控制 Kotlin 编写的声明如何编译成字节码并暴露给 Java 调用者。
 * 还可以代替 Java 语言中对应的关键字。
 * @author wangzhichao
 * @since 2022/4/19
 */
fun main() {

}
@Synchronized
fun synchronizedMethod() {}
/*
// 编译成 Java 的样子：
public static final synchronized void synchronizedMethod() {
}
*/

class KotlinSingleton private constructor(){
    companion object {
        @Volatile
        private var instance: KotlinSingleton? = null

        @JvmStatic
        fun getInstance(): KotlinSingleton {
            if (instance == null) {
                synchronized(KotlinSingleton::class) {
                    if (instance == null) {
                        instance = KotlinSingleton()
                    }
                }
            }
            return instance!!
        }
    }
}
