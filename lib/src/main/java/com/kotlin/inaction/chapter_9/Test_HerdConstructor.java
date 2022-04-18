package com.kotlin.inaction.chapter_9;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2022/4/17
 */
public class Test_HerdConstructor {
    static class Animal {}
    static class Animal22 extends Animal {}
    static class Animal33 extends Animal22 {}

    static class Herd<T extends Animal> {
        private List<T> list;
        public Herd(T ... args) {
            list = Arrays.asList(args);
        }

        public T get(int index) {
            return list.get(index);
        }
    }

    public static void main(String[] args) {
        Herd<Animal> herd = new Herd<>(new Animal(), new Animal22(), new Animal33());
        Animal animal = herd.get(0);

        Herd<Animal22> herd2 = new Herd<>(new Animal22(), new Animal33());
        Animal22 animal2 = herd2.get(0);
    }
}
