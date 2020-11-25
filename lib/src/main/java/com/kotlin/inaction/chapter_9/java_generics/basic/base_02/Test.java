package com.kotlin.inaction.chapter_9.java_generics.basic.base_02;

/**
 * 这部分开始泛型
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        // Integer
        Point<Integer> integerPoint = new Point<>();
        integerPoint.setX(new Integer(100));
        Integer integerX = integerPoint.getX();

        // Float
        Point<Float> floatPoint = new Point<>();
        floatPoint.setX(new Float(100.12f));
        Float floatX = floatPoint.getX();

        // 展示一个传入类型不对的例子
        Point<Integer> intPoint = new Point<>();
        // intPoint.setX(new String("hello")); // 编译报错：需要的是 Integer 类型，传入 String 类型干啥!!!
        intPoint.setX(null);
        System.out.println(intPoint.getX());
    }
}

/**
 * 总结：
 * 1，类使用泛型和之前没有泛型的区别：
 * setX 的时候，会提示我们输入对应的类型；
 * getX 的时候，不用进行强转就可以得到对应的类型。
 * 2，定义泛型：类名<T>
 * 3，这里可以看出泛型的优势：
 * 不用进行强制转换了，传入类型不对时在编译器就会提示出来了。
 */
