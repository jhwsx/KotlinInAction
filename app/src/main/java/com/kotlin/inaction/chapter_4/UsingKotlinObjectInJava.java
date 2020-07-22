package com.kotlin.inaction.chapter_4;

/**
 * @author wangzhichao
 * @date 2020/7/23
 */
public class UsingKotlinObjectInJava {
    public static void main(String[] args) {
        Payroll.INSTANCE.getAllEmployees().add(new Person("wzc", 1, 1.0f));
        Payroll.INSTANCE.getAllEmployees().add(new Person("wzj", 2, 2.0f));
        Payroll.INSTANCE.getAllEmployees().add(new Person("wcx", 3, 3.0f));
        System.out.println(Payroll.INSTANCE.getAllEmployees());
    }
}
