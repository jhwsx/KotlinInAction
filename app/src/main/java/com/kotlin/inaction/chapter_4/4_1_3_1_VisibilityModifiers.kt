package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/18
 */
interface Focusable1 {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

internal open class TalkativeButton : Focusable1 {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() {
//    yell()
//
//    whisper()
//}

fun main(args: Array<String>) {

}

/**
 * 总结：
 * 1，java 中默认可见性是包可见性，kotlin 中如果省略了可见性修饰符，那么就是public的；
 * 2，kotlin中没有java中的默认可见性的概念；
 * 3，kotlin中的internal修饰符，表示只在模块内部可见。一个模块就是一组一起编译的kotlin文件。
 * 4，kotlin中允许在顶层声明中使用private的可见性，包括类、函数和属性，表示这些声明只在声明它们的文件中可见。
 * 5，kotlin中的protected与java中的protected不同：在java中，protected可以从同一个包中访问一个protected的成员，
 * 在kotlin中protected成员只能在类和它的子类中可见。
 * 6, kotlin中一个外部类不能看到其内部（或者嵌套）类中的private成员。
 * 7, kotlin中类的扩展函数不能访问它的private和protected成员
 */