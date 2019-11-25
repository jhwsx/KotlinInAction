package com.kotlin.inaction.chapter_9.java_generics.advance.advance_07;

import com.kotlin.inaction.chapter_9.java_generics.advance.advance_06.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * 无边界通配符 ? 的 super 限定
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        List<? super Manager> list; // // 给无边界通配符 ? 加上限定 Manager，表示只可以给泛型变量填充 Manager 及其 Manager 的父类。
        list = new ArrayList<Employee>(); // Employee 是 Manager 的父类
        list = new ArrayList<Manager>(); // Manager 自身
//        list = new ArrayList<CEO>(); // CEO 是 Manager 的子类，不符合条件

        // ===========重要====================
        // 利用<? super Manager> 定义的变量，只可以修改其中的值，不可取
        list = new ArrayList<Employee>();
//        list.add(new Employee()); // 编译报错
        list.add(new Manager());
        list.add(new CEO());

        Object object = list.get(0);
        System.out.println(object);
    }
}
