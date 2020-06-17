package com.kotlin.inaction.chapter_9.java_generics.basic.base_05;

import java.util.List;

/**
 * 这部分学习泛型函数
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        // 静态函数使用
        StaticFans.staticMethod("willwaywang6");
        StaticFans.<String>staticMethod("willwaywang6"); // 显示地指定泛型，这个是个好的方式
        // 常规函数使用
        StaticFans staticFans = new StaticFans();
        staticFans.otherMethod("wangzhichao");
        staticFans.<String>otherMethod("wangzhichao");

        String json = "[{\"name\":\"wangzhichao1\",\"age\":18},{\"name\":\"wangzhichao2\",\"age\":19},{\"name\":\"wangzhichao3\",\"age\":20},{\"name\":\"wangzhichao4\",\"age\":21}]";
        List<Person> personList = StaticFans.<Person>parseArray(json);
        System.out.println(personList);
    }
}