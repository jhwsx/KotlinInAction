package com.kotlin.inaction.chapter_9.java_generics.basic.base_02;

/**
 * 泛型 Point 类
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Point<T> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

/**
 * 总结：
 * 1，T 在类中，就是替换了原来的 Integer，Float 而已。
 */
