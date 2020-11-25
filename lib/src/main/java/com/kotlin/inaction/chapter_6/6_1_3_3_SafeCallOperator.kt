package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/2/26
 */
class School(val name: String, val address: String)

class Classroom(val name: String, val school: School?)

class Student(val name: String, val classroom: Classroom?)

fun Student.schoolName(): String {
    val schoolName = this.classroom?.school?.name
    return if (schoolName != null) schoolName else "Unknown"
}

fun main(args: Array<String>) {
    val student = Student("wzc", null)
    println(student.schoolName())

    val student2 = Student("wzj", Classroom("shaolinsi-1", null))
    println(student2.schoolName())

    val student3 = Student("wcg", Classroom("yingcai-1", School("yingcai", "lvchang")))
    println(student3.schoolName())
}