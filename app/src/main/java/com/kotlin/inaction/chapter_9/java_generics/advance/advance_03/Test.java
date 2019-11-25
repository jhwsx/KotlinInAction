package com.kotlin.inaction.chapter_9.java_generics.advance.advance_03;

import java.io.Serializable;

/**
 * 绑定类
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getFruitName(new Banana()));
        System.out.println(Test.<Apple>getFruitName(new Apple()));
        // System.out.println(getFruitName(new Orange())); // 此行编译报错：Orange 不符合 Fruit，因为 Orange 不是 Fruit 的子类。

        System.out.println(Test.<PineApple>getFruitName2(new PineApple()));
        // Test.<Apple>getFruitName2(new Apple()); // 此行编译报错：Apple 没有在它的限定之内，Apple 需要实现 Serializable。
    }

    public static <T extends Fruit> String getFruitName(T t) {
        return t.getName();
    }
    // 绑定多个限定：
    // T 需要是 Fruit 的子类，还需要是 Serializable 的子类
    public static <T extends Fruit & Serializable> String getFruitName2(T t) {
        return t.getName();
    }
}
