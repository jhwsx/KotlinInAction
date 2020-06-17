package com.kotlin.inaction.chapter_9.java_generics.advance.advance_02;

/**
 * 学习类型绑定: 这里是绑定接口
 * <T extends BoundingType> : extends 表示的意思是子类型，而非继承，代表 T 是 BoundingType 的子类型；
 * BoudingType 可以是类，也可以是接口。
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("wangzhichao1", 18);
        Student student2 = new Student("wangzhichao2", 32);
        Student student3 = new Student("wangzhichao3", 6);
        StudentComparable min = Test.<StudentComparable>min(new StudentComparable(student1), new StudentComparable(student2), new StudentComparable(student3));
        System.out.println(min.student);
    }

//    public static <T> T min(T... a) {
//        T min = a[0];
//        for (T item : a) {
//            // 为什么这里 compareTo 会编译报红呢？因为 T 这里继承的是 Object 类，它只有 Object 类的方法。
//            // 但是，我们需要调用 Comparable 接口的 compareTo 方法，怎么办呢？
//            // 答案：需要类型绑定。
//            if (min.compareTo(item)) {
//                min = item;
//            }
//        }
//        return min;
//    }

    public static <T extends Comparable<T>> T min(T... a) {
        T min = a[0];
        for (T item : a) {
            if (min.compareTo(item)) {
                min = item;
            }
        }
        return min;
    }

    static class StudentComparable implements Comparable<StudentComparable> {

        private Student student;

        public StudentComparable(Student student) {
            this.student = student;
        }

        @Override
        public boolean compareTo(StudentComparable studentComparable) {
            return this.student.getAge() > studentComparable.student.getAge();
        }
    }
}

/**
 * 总结：
 * 1，类型绑定<T extends BoundingType>的好处：
 * 对填充的泛型加以限定，T 只能是 BoundingType 的子类；
 * 使用泛型变量 T 时，可以使用 BoundingType 内部的函数，因为上面说了，T 是 BoundingType 的子类，当然获取了父类的公开方法。
 */
