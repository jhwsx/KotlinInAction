package com.kotlin.inaction;

import java.util.Random;

/**
 * @author wangzhichao
 * @since 2021/1/20
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int anInt = new Random().nextInt(5);
            if (anInt < 0 || anInt >= 5) {
                System.out.println(anInt);
            }
        }
        System.out.println("end");
    }
}
