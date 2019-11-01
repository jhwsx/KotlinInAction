package com.kotlin.inaction.chapter_9.java_generics.advance.advance_05;

/**
 * 无边界通配符 ?
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {

        Point<?> point; // ? 表示无边界通配符，可以代表任意的类。
        point = new Point<>(3, 3);
        point = new Point<>(4.3f, 4.3f);
        point = new Point<>(12.3, 13.2);
        point = new Point<>(10_000L, 20_000L);
        point = new Point<Object>(); // 填充了任意类型，不加以限定后面会报错。因为我们的 Point 类型的数值需要是数值型才有意义。
    }
}

/**
 * 总结：
 * 1，? 与 T 的区别是什么？
 * 泛型变量 T 不能用于创建变量，只能在类，接口，函数声明以后，才能使用。
 * 无边界通配符 ? 只能用于填充泛型变量 T,表示通配任何类型；只是填充泛型变量 T 方式的一种。
 * 2，错误用法举例：
 * ? x; // 无边界通配符只能用于同冲泛型变量 T，不能用于定义变量。
 */
