package com.kotlin.inaction.reference.classes_and_objects.`02_properties_and_fields`

class Student(_name: String, _age: Int) {
    val name = _name
    var age = _age
    private var _grades: Map<String, Int>? = null
    val grades: Map<String, Int>
        get() {
            if (_grades == null) {
                _grades = loadGrades()
            }
            return _grades!!
        }

    private fun loadGrades(): MutableMap<String, Int> {
        println("loadGrades() called")
        val result = mutableMapOf<String, Int>()
        result.put("Chinese", 100)
        result.put("Math", 99)
        result.put("English", 100)
        return result
    }
}

fun main(args: Array<String>) {
    val student = Student("willwaywang6", 16)
    println("grades=${student.grades}")
    println("grades=${student.grades}")
}