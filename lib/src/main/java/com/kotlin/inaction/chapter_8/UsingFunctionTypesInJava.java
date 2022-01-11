package com.kotlin.inaction.chapter_8;

import java.util.ArrayList;
import java.util.List;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/**
 * @author wzc
 * @date 2019/5/10
 */
public class UsingFunctionTypesInJava {
    public static void main(String[] args) {
        // 在 Java8 中使用 lambda 表达式传参
        System.out.println("Java8:");
        _8_1_3_1_UsingFunctionTypesInJavaKt.processTheAnswer(number -> number + 1);
        // 在 Java8 以前，传递一个实现了函数接口中的 invoke 方法的匿名类的实例
        System.out.println("Java8以前：");
        _8_1_3_1_UsingFunctionTypesInJavaKt.processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer number) {
                return number + 1;
            }
        });
        // 在 Java 中使用 kotlin 标准库中以 lambda 作为参数的扩展函数，但是必须显式地传递一个接收者对象作为第一个参数
        // 这是因为这里的 forEach 是一个扩展函数，它的函数类型是带接收者的函数类型。
        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE; // 显式地返回值。
        });
    }
}
