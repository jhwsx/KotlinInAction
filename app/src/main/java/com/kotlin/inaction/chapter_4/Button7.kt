package com.kotlin.inaction.chapter_4

import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectOutputStream

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
class Button7 : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {

    }

    inner class InnerClass {
        fun method() {
            println(this@Button7)
        }
    }
}

fun main(args: Array<String>) {
    val buttonState = Button7.ButtonState()
    try {
        val oos = ObjectOutputStream(FileOutputStream("a.txt"))
        oos.writeObject(buttonState)
        oos.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println("ok")

}
/**
 * 总结：
 * 1， 嵌套类与内部类的区别是嵌套类不存储外部类的引用；内部类存储了外部类的引用。
 */