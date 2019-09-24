package com.kotlin.inaction.reference.classes_and_objects.visibilitymodifiers;

/**
 * 在 Java 中，外部类可以访问内部类的 private 变量
 * @author wangzhichao
 * @date 2019/09/24
 */
public class OuterJava {
    public void method() {
        Inner inner = new Inner();
        int result = inner.number * 2;
    }

    private class Inner {
        private int number = 0;
    }
}
