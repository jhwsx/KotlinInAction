package com.kotlin.inaction.chapter_9.java_generics.basic.base_04;

/**
 * 实现泛型接口的泛型类
 * 这个与 InfoImpl 相比，可以让用户来定义泛型接口所需要的变量类型，而不是像 InfoImpl 那样，被写死了。
 *  泛型类定义的 T，会传递给泛型接口。
 * @author wangzhichao
 * @date 2019/11/01
 */
public class InfoImpl2<T> implements Info<T> {
    private T var;

    @Override
    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return var;
    }
}
