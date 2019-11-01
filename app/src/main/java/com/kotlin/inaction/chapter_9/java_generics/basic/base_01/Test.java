package com.kotlin.inaction.chapter_9.java_generics.basic.base_01;

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        // 正常情况下1：
        ObjectPoint integerPoint = new ObjectPoint();
        integerPoint.setX(new Integer(100));
        Integer integerX = (Integer) integerPoint.getX();
        // 正常情况下2：
        ObjectPoint floatPoint = new ObjectPoint();
        floatPoint.setX(new Float(100.12f));
        Float floatX = (Float) floatPoint.getX();
        // 异常情况：
        ObjectPoint intPoint = new ObjectPoint();
        intPoint.setX(new Integer(200));
        // 这里过了 n 行代码, 我以为当时存进去的是 String，所以取出时我就强转为 String 了。
        String s = (String) intPoint.getX(); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    }
}

/**
 * 总结：
 * 1，这段代码演示了没有泛型的时代：我们会出现类型强转异常。
 */
