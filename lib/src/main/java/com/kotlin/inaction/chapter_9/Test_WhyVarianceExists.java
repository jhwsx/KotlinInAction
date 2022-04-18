package com.kotlin.inaction.chapter_9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2022/4/17
 */
public class Test_WhyVarianceExists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bac");
        printContents(list);
        List<Number> list2 = new ArrayList<>();
        addAnswer(list2);
        System.out.println(list2);
        List<Integer> list3 = new ArrayList<>();
        addAnswer(list3);
        System.out.println(list3);
        /*
        [abc, bac]
        [42]
        [42]
         */
    }

    private static void printContents(List<? extends Object> list) {
        System.out.println(list);
    }

    private static void addAnswer(List<? super Integer> list) {
        list.add(42);
    }
}


