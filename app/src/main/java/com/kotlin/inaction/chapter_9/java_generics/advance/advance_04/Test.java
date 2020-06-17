package com.kotlin.inaction.chapter_9.java_generics.advance.advance_04;

/**
 * 为什么需要通配符
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        Point<Integer> integerPoint = new Point<>(3, 3);
        Point<Float> floatPoint = new Point<>(4.3f, 4.3f);
        Point<Double> doublePoint = new Point<>(12.3, 13.2);
        Point<Long> longPoint = new Point<>(10_000L, 20_000L);

        // 如何用一个变量，来取代上面的四个变量呢？
    }
}
