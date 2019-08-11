package com.kotlin.inaction.chapter_5

/**
 * <pre>
 *     author : wangzhichao
 *     e-mail : wangzhichao@adups.com
 *     time   : 2019/08/11
 *     desc   :
 *     version: 1.0
 * </pre>
 */
data class Man(val name: String, val age: Int, val type: Int)

fun main(args: Array<String>) {
    val list = mutableListOf<Man>()
    list.add(Man("wzc", 31,2))
    list.add(Man("wzj", 32,1))
    list.add(Man("wcx", 3,1))
    list.add(Man("wcg", 7,1))
    println("before sort")
    for (man in list) {
        println(man)
    }
//    list.sortedWith(Comparator {lh, rh ->
//        if (lh.type.compareTo(rh.type) == 0) {
//            lh.age.compareTo(rh.age)
//        } else {
//            lh.type.compareTo(rh.type)
//        }
//    })
//    println("after sort")
//    for (man in list) {
//        println(man)
//    }
    val sortedWith = list.sortedWith(Comparator { lh, rh ->
        if (lh.type.compareTo(rh.type) == 0) {
            lh.age.compareTo(rh.age)
        } else {
            lh.type.compareTo(rh.type)
        }
    })
    list.clear()
    list.addAll(sortedWith)
    println("after sort")
    for (man in list) {
        println(man)
    }
}

/*
打印结果：
before sort
Man(name=wzc, age=31, type=2)
Man(name=wzj, age=32, type=1)
Man(name=wcx, age=3, type=1)
Man(name=wcg, age=7, type=1)
after sort
Man(name=wcx, age=3, type=1)
Man(name=wcg, age=7, type=1)
Man(name=wzj, age=32, type=1)
Man(name=wzc, age=31, type=2)
 */