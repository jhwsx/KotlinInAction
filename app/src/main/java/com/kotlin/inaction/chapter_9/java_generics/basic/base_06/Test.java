package com.kotlin.inaction.chapter_9.java_generics.basic.base_06;

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        String json = "{\"name\":\"wangzhichao1\",\"age\":18}";
        Person person = Util.<Person>parseJson(json, Person.class);
        System.out.println(person);

        Integer[] integers = Util.fun(1, 2, 3, 4, 5, 6);
    }
}
