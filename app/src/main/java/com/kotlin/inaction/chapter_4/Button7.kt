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