package com.kotlin.inaction.chapter_6

/**
 *
 * @author wzc
 * @date 2019/3/17
 */
interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process(): Unit {
        println("NoResultProcessor process()")
        return Unit
    }
}

class ResultProcessor : Processor<String> {
    override fun process(): String {
        return "ResultProcessor process()"
    }
}

fun main(args: Array<String>) {
    val noResultProcessor = NoResultProcessor()
    noResultProcessor.process()

    val resultProcessor = ResultProcessor()
    val process = resultProcessor.process()
    println(process)
    var list:List<Int> = listOf<Int>(1,2,3)

}