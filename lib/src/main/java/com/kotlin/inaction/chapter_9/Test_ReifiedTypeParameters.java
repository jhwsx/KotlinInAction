package com.kotlin.inaction.chapter_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kotlin.collections.CollectionsKt;

/**
 * @author wzc
 * @date 2019/8/11
 */
public class Test_ReifiedTypeParameters {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList("adups", 11, "abup"));
//        _9_2_2_4_DeclaringFunctionsWithReifiedTypeParametersKt.
        List<String> strings = CollectionsKt.filterIsInstance(list, String.class);
        System.out.println(strings); // [adups, abup]
    }
}

/**
 * 总结：
 * 1，为什么 kotlin 中的那个内联函数不允许调用？
 * 带 reified 类型参数的 inline 函数不能在 java 代码中调用，因为调了也不管用，干脆不让调用了。
 * 实际上，Kotlin 提供了专门给 Java 用的版本，在 _CollectionsJvm.kt 里面；带 reified 修饰的
 * filterIsInstance 方法是在 _Collections.kt 里面。
 *
 * 普通的内联函数可以像常规函数那样在 Java 中调用，但是不可以被内联。
 */
