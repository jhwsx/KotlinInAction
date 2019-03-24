package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/24
 */
fun main(args: Array<String>) {
    println("list:")
    val list = listOf<Int>(1, 2, 3)
    val mutableList = mutableListOf<String>("a", "b", "c")
    mutableList.remove("a")
    println(mutableList)
    val arrayList = arrayListOf<Long>(1L, 2L, 3L)
    arrayList.add(4L)
    println(arrayList)

    println("set:")
    val set = setOf<Int>(2, 2, 3, 4, 5)
    println(set)
    val mutableSet = mutableSetOf<Char>('x', 'y', 'z')
    mutableSet.add('w')
    println(mutableSet)

    val hashSet = hashSetOf<Char>('a', 'b')
    hashSet.remove('a')
    println(hashSet)

    val linkedHashSet = linkedSetOf<String>("A", "B", "C")
    linkedHashSet.remove("A")
    println(linkedHashSet)

    val treeSet = sortedSetOf(1, 2, 3)
    treeSet.remove(1)
    println(treeSet)

    println("map:")
    val map = mapOf<Int, String>(Pair(1, "a"), Pair(2, "b"))
    println(map)

    val hashMap = hashMapOf<String, String>(Pair("1", "A"), Pair("2", "B"))
    hashMap.remove("1")
    println(hashMap)

    val linkedHashMap = linkedMapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
    linkedHashMap.put(3, "three")
    println(linkedHashMap)

    val sortedMap = sortedMapOf(Pair(1, "一"), Pair(2, "二"))
    sortedMap.put(3, "三")
    println(sortedMap)
}