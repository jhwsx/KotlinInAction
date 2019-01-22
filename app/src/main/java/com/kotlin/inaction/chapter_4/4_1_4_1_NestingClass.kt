package com.kotlin.inaction.chapter_4

import java.io.Serializable

/**
 *
 * @author wzc
 * @date 2019/1/19
 */
interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

