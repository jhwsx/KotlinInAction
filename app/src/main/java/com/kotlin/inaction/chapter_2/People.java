package com.kotlin.inaction.chapter_2;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class People {
    private final String name;
    private boolean isMarried;

    public People(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
