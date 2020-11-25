package com.kotlin.inaction.chapter_6;

import java.util.List;

/**
 * @author wangzhichao
 * @date 2020/10/13
 */
public interface DataParser<T> {
    void parseData(String input, List<T> output, List<String> errors);
}
