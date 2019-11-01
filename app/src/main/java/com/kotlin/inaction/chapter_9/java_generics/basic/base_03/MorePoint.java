package com.kotlin.inaction.chapter_9.java_generics.basic.base_03;

/**
 * 多泛型变量定义
 * 多个泛型之间以逗号隔开
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public class MorePoint<T, U> {
    private T x;
    private T y;

    private U name;

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

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }
}


