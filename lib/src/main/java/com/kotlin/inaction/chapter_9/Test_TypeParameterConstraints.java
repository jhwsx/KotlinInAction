package com.kotlin.inaction.chapter_9;

import java.io.IOException;

/**
 * @author wzc
 * @date 2019/8/7
 */
public class Test_TypeParameterConstraints {
    private static <T extends CharSequence & Appendable> void ensureTrailingPeriod(T seq) throws IOException {
        if (seq.charAt(seq.length() - 1) != '.') {
            seq.append('.');
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello, world");
        ensureTrailingPeriod(stringBuilder);
        System.out.println(stringBuilder);
    }
}
