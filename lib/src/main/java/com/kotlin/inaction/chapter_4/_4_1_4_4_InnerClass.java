package com.kotlin.inaction.chapter_4;

/**
 * @author wangzhichao
 * @date 2020/7/20
 */
public class _4_1_4_4_InnerClass {
    class Inner {
        private int privateField = 5;
        private void privateMethod() {
            System.out.println("privateMethod()");
        }
        public _4_1_4_4_InnerClass getOuterReference() {
            return _4_1_4_4_InnerClass.this;
        }

        public Inner getInnerReference() {
            return this;
        }
    }

    static class StaticInner {
        private int privateField = 5;
        private void privateMethod() {
            System.out.println("privateMethod()");
        }
    }

    public static void main(String[] args) {
        _4_1_4_4_InnerClass outer = new _4_1_4_4_InnerClass();
        Inner inner = outer.new Inner();
        System.out.println("inner.privateField = " + inner.privateField);
        inner.privateMethod();

        StaticInner staticInner = new StaticInner();
        System.out.println("staticInner.privateField = " + staticInner.privateField);
        staticInner.privateMethod();
    }
}
