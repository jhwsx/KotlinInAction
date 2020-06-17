package com.kotlin.inaction.chapter_9.java_generics.basic.base_03;

/**
 * 这部分学习多泛型变量类
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        MorePoint<Integer, String> morePoint = new MorePoint<>();
        morePoint.setName("morepoint");
        morePoint.setX(100);
        morePoint.setY(200);
        String name = morePoint.getName();
        Integer x = morePoint.getX();
        Integer y = morePoint.getY();
    }
}
