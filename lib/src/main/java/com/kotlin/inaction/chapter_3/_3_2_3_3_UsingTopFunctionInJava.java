package com.kotlin.inaction.chapter_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzc
 * @date 2019/1/12
 */
public class _3_2_3_3_UsingTopFunctionInJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(_3_2_3_1_joinKt.joinToString4(list, ", ", "{", "}"));
        System.out.println(StringFunctions.joinToString5(list, ", ", "{", "}"));
    }
}
