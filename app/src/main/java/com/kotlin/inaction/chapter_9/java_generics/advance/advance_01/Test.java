package com.kotlin.inaction.chapter_9.java_generics.advance.advance_01;

/**
 * 为什么要类型绑定？
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {

    }

//    public static <T> T min(T... a) {
//        T min = a[0];
//        for (T item : a) {
//            // 为什么这里 compareTo 会编译报红呢？因为 T 这里继承的是 Object 类，它只有 Object 类的方法。
//            // 但是，我们需要调用 Comparable 接口的 compareTo 方法，怎么办呢？
//            // 答案：需要类型绑定。
//            if (min.compareTo(item)) {
//                min = item;
//            }
//        }
//        return min;
//    }
}
