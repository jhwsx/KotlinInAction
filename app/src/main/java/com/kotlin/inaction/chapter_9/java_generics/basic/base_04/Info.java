package com.kotlin.inaction.chapter_9.java_generics.basic.base_04;

/**
 * 泛型接口定义
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public interface Info<T> {
    void setVar(T var);

    T getVar();
}

/**
 * 总结：
 * 1，泛型类和泛型接口的区别是什么呢？
 * 在定义上没有区别。
 * 区别体现在使用上。
 */