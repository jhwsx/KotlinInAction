package com.kotlin.inaction.chapter_4;

import org.jetbrains.annotations.NotNull;

/**
 * @author wzc
 * @date 2019/1/19
 */
public class Button6 implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public class ButtonState implements State {
    }

}
