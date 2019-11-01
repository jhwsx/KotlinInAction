package com.kotlin.inaction.chapter_9.java_generics.basic.base_04;

/**
 * 这部分学习泛型接口
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        InfoImpl info = new InfoImpl();
        info.setVar("harvic");
        System.out.println(info.getVar());

        InfoImpl2<String> infoImpl2 = new InfoImpl2<>();
        infoImpl2.setVar("willwaywang6");
        System.out.println(infoImpl2.getVar());
    }
}
