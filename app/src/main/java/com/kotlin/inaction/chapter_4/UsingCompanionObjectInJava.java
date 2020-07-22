package com.kotlin.inaction.chapter_4;

/**
 * @author wangzhichao
 * @date 2020/7/23
 */
public class UsingCompanionObjectInJava {
    public static void main(String[] args) {
        System.out.println(User10.Companion.newSubscribingUser("123456@qq.com"));
        System.out.println(User10.newFacebookUser(2));
    }
}
