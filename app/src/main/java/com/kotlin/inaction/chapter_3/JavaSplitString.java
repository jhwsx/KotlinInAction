package com.kotlin.inaction.chapter_3;

import java.util.Arrays;

/**
 * @author wangzhichao
 * @since 2020/6/22
 */
public class JavaSplitString {
    public static void main(String[] args) {
        String str = "12.345-6.A";
        String[] split = str.split(".");
        System.out.println(Arrays.toString(split)); // []
        String[] split1 = str.split("\\.");
        System.out.println(Arrays.toString(split1)); // [12, 345-6, A]
    }
}
/**
 * 总结：
 * 1，在 Java 中，split(".") 获取到的是空数组；在 Kotlin 中，是可以正常返回的。
 * 这是因为在 Java 中，"." 被作为正则表达式，必须对 . 进行转义处理才可以。
 *
 */
