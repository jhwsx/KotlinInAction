package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/24
 */
class LengthCounter {
    var counter: Int = 0
        private set // 不能在类外部修改这个属性


    fun addWord(word: String) {
        counter += word.length
    }
}

// 这种写法没有了 setter 方法，不合适
//class HeightCounter {
//    val counter: Int = 0
//
//    fun addHeight(height: Int) {
//        counter += height
//    }
//}


class WidthCounter {
    var counter: Int = 0
    //  private get // Getter visibility must be the same as property visibility
}

class DistanceCounter {
    private var counter: Int = 0
        private get // 这样可以，但是没有意义。
}

class GradesCounter {
    var counter: Int = 0
        protected set

    fun addGrades(grades: Int) {
        counter += grades
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    // lengthCounter.counter = 2 // Cannot assign to 'counter': the setter is private in 'LengthCounter'
    println(lengthCounter.counter)
    val gradesCounter = GradesCounter()
//    gradesCounter.counter = 5
}

/**
 * 总结：
 * 1，访问器的可见性默认与属性的可见性相同；
 * 2，可以通过在 get 和 set 关键字前放置可见性修饰符的方式来修改其可见性。
 * 3, 若要使用 private get， 那么属性也得是 private 的。
 * 4, 在一个 final 类中，protected 的可见性和 private 是一样的。
 */
