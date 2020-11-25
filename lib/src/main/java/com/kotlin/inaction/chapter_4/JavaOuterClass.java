package com.kotlin.inaction.chapter_4;

/**
 * @author wangzhichao
 * @since 20-6-24
 */
class JavaOuterClass {
    class Inner {
        JavaOuterClass getOuterReference() {
            return JavaOuterClass.this;
        }
    }
}
