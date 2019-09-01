package com.kotlin.inaction;

public class Student {
    private final String name;
    private int age;

    public Student(String _name, int _age) {
        name = _name;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
