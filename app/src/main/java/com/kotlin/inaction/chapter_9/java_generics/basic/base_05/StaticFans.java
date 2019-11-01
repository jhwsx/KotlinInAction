package com.kotlin.inaction.chapter_9.java_generics.basic.base_05;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kotlin.inaction.chapter_2.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
public class StaticFans {
    // 静态函数
    public static <T> void staticMethod(T a) { // 在这里 <T> 是定义，参数里的 T 是使用。
        System.out.println("staticMethod: " + a.toString());
    }
    // 普通函数
    public <T> void otherMethod(T a) {
        System.out.println("otherMethod: " + a.toString());
    }

    // 返回值中存在泛型
    public static <T> List<T> parseArray(String json) {
        Gson gson = new Gson();
        List<T> list= gson.fromJson(json, new TypeToken<List<T>>() {}.getType());
        return list;
    }
}
