package com.kotlin.inaction.chapter_9.java_generics.basic.base_06;

import com.google.gson.Gson;

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Util {
    // 使用 Class<T> 传递泛型类 Class 对象
    public static <T> T parseJson(String json, Class<T> clazz){
        Gson gson = new Gson();
        T t = gson.fromJson(json, clazz);
        return t;
    }

    // 定义泛型数组
    public static <T> T[] fun(T... arg) {
        return arg;
    }
}
