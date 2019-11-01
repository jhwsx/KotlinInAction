package com.kotlin.inaction.chapter_9.java_generics.advance.advance_06;

/**
 * 无边界通配符 ? 的 extends 绑定
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        Point<? extends Number> point; // 给无边界通配符 ? 加上限定 Number，表示只可以给泛型变量填充 Number 及其 Number 的子类。
        point = new Point<Integer>(3, 3);
        point = new Point<Float>(4.3f, 4.3f);
        point = new Point<Double>(12.3, 13.2);
        point = new Point<Long>(10_000L, 20_000L);
        point = new Point<Number>();
        // point = new Point<String>(); // 编译报错：String 不是 Number 的子类

        // ===========重要====================
        // 利用<? extends Number> 定义的变量，只可以取其中的值，不可修改
        point = new Point<Integer>(3, 33); // 这时 point 的类型是 Point<? extends Number>,即派生自Number类的未知类型，而不是Point<Integer>。
        Number x = point.getX(); //
        //point.setX(new Integer(22));
    }
}
