package com.kotlin.inaction.reference.classes_and_objects.visibilitymodifiers;

/**
 * 在 Java 中，外部类可以访问内部类的 private 变量。
 * @author wangzhichao
 * @date 2019/09/24
 */
class OuterClass {

    static class NestedClass {
        private static int x = 5;
    }

    public static int f() {
        return NestedClass.x;
    }
}
public class TestJava {
    public static void main(String[] args) {
        System.out.println(OuterClass.f());
    }
}
