package com.kotlin.inaction.chapter_5;

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
    }
}
