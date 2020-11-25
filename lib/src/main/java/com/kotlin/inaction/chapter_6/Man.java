package com.kotlin.inaction.chapter_6;

import org.jetbrains.annotations.NotNull;

/**
 * @author wzc
 * @date 2019/3/13
 */
public class Man {
    private final @NotNull String name;

    public Man(@NotNull String name) {
        this.name = name;
    }

    public @NotNull String getName() {
        return name;
    }
}
