package com.kotlin.inaction.chapter_2;

/**
 * @author wzc
 * @date 2018/12/27
 */
public class PersonJavaTest {
    public static void main(String[] args) {
        Person person = new Person("John", false);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
    }
}
