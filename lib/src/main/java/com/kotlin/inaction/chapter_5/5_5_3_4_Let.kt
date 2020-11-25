package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/8/18
 */
fun main(args: Array<String>) {
    // do not use let
    val numbers1 = listOf("one", "two", "three", "four", "five")
    var first = numbers1.first()
    println("The first item of the list is '$first'")
    first = if (first.length > 5) first else "!$first!"
    val modifiedFirst = first.toUpperCase()
    println("First item after modification: '$modifiedFirst'")
    println("------------------------------------------------------------")
    // use let
    val numbers = listOf("one", "two", "three", "four", "five")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length > 5) firstItem else "!$firstItem!"
    }.toUpperCase()
    println("First item after modification: '$modifiedFirstItem'")
}

/*
The first item of the list is 'one'
First item after modification: '!ONE!'
------------------------------------------------------------
The first item of the list is 'one'
First item after modification: '!ONE!'
*/