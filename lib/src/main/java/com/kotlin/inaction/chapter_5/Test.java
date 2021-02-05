package com.kotlin.inaction.chapter_5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhichao
 * @since 2021/1/19
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 8);
        map.put("banana", 3);
        map.put("pear", 4);
        map.put("orange", 4);
        System.out.println(map);

        Comparator<Integer> comparator = (Integer o1, Integer o2) -> Integer.compare(o1, o2);
        comparator.compare(1, 2);

        Comparator<Integer> comparator1 = (o1, o2) -> {
            System.out.println("xxxxx");
            return Integer.compare(o1, o2);
        };
    }
}
