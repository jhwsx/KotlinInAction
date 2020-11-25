package com.kotlin.inaction.chapter_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzc
 * @date 2019/1/11
 */
public class DefaultParamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(_3_2_2_2_JoinToStringFinalKt.joinToString2(list, ", ", "[", "]"));
        System.out.println(_3_2_2_2_JoinToStringFinalKt.joinToString3(list));
    }
}
/*
  总结：
  1，Java 没有默认参数的概念，当从 Java 中调用 kotlin 函数的时候，必须显式地指定所有参数，否则会报错；
  2，如果需要 java 调用 kotlin 函数更方便，可以给 kotlin 函数增加 @JavaOverloads 注解，这个注解的
  含义是指示编译器对 kotlin 的函数生成 Java 重载函数，从最后一个开始省略每个参数。
 */
