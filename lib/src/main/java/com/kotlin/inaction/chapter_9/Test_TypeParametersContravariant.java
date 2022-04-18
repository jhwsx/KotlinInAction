package com.kotlin.inaction.chapter_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2022/4/17
 */
public class Test_TypeParametersContravariant {

    public static void main(String[] args) {
        Comparator<Object> objectComparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() - o2.hashCode();
            }
        };

        List<String> strings = new ArrayList<>();
        strings.add("bca");
        strings.add("abc");
        strings.add("bac");
        Collections.sort(strings, objectComparator);
        System.out.println(strings); // [abc, bac, bca]
    }
}
