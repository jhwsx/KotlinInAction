package com.kotlin.inaction.chapter_6;

import java.util.List;

/**
 * @author wzc
 * @date 2019/3/24
 */
public class CollectionUtils {
    public static List<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
