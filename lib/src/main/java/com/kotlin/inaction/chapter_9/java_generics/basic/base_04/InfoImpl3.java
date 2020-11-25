package com.kotlin.inaction.chapter_9.java_generics.basic.base_04;

/**
 * 实现泛型接口的多个类型参数的泛型类
 * @author wangzhichao
 * @date 2019/11/01
 */
public class InfoImpl3<T, K, U> implements Info<T> {
    private T var;
    private K x;
    private U y;

    @Override
    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return var;
    }

    public K getX() {
        return x;
    }

    public void setX(K x) {
        this.x = x;
    }

    public U getY() {
        return y;
    }

    public void setY(U y) {
        this.y = y;
    }
}
