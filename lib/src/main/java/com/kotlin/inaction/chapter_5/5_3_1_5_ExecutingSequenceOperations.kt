package com.kotlin.inaction.chapter_5

interface MySequence<out T> {
    operator fun iterator(): Iterator<T>
}

class MySequenceImpl<T>(private val iterator: Iterator<T>) : MySequence<T> {
    override fun iterator(): Iterator<T> = iterator
}

class MyTransformingSequence<T, R>(
    private val sequence: MySequence<T>,
    private val transformer: (T) -> R
): MySequence<R> {
    override fun iterator(): Iterator<R> = object: Iterator<R> {
        val iterator = sequence.iterator()
        override fun next(): R {
            return transformer(iterator.next())
        }
        override fun hasNext(): Boolean {
            return iterator.hasNext()
        }
    }
}

class MyFilteringSequence<T>(
    private val sequence: MySequence<T>,
    private val predicate: (T) -> Boolean
):MySequence<T> {
    override fun iterator(): Iterator<T> = object: Iterator<T> {
        val iterator = sequence.iterator()
        var nextState: Int = -1 // -1 for unknown, 0 for done, 1 for continue
        var nextItem: T? = null

        override fun next(): T {
            if (nextState == -1)
                calcNext()
            if (nextState == 0)
                throw NoSuchElementException()
            val result = nextItem
            nextItem = null
            nextState = -1
            return result as T
        }

        override fun hasNext(): Boolean {
            if (nextState == -1) {
                calcNext()
            }
            return nextState == 1
        }

        private fun calcNext() {
            while (iterator.hasNext()) {
                val item = iterator.next()
                if (predicate(item)) {
                    nextItem = item
                    nextState = 1
                    return
                }
            }
            nextState = 0
        }

    }
}

fun <T> MySequence<T>.toList(): List<T> {
    val result = ArrayList<T>()
    for (item in this) {
        result.add(item)
    }
    return result
}

fun <T> Iterable<T>.asMySequence(): MySequence<T> {
    return MySequenceImpl(this.iterator())
}

fun <T, R> MySequence<T>.mymap(transformer: (T) -> R): MySequence<R> {
    return MyTransformingSequence<T, R>(this, transformer)
}

fun <T> MySequence<T>.myfilter(predicate: (T) -> Boolean): MySequence<T> {
    return MyFilteringSequence<T>(this, predicate)
}
/**
 *
 * @author wzc
 * @date 2021/12/31
 */
fun main(args: Array<String>) {
    val people = listOf<Person>(
        Person("Alice", 29),
        Person("Bob", 31)
    )
    // 没有实现链式编程
    val mySequenceImpl = MySequenceImpl(people.iterator())
    val myTransformingSequence = MyTransformingSequence(mySequenceImpl) {
        it.name
    }
    val myFilteringSequence = MyFilteringSequence(myTransformingSequence) {
        it.startsWith('A')
    }
    val list = myFilteringSequence.toList()
    println(list)
    // 通过定义扩展函数，来实现链式编程
    val result = people.asMySequence()
        .mymap { it.name }
        .myfilter { it.startsWith('A') }
        .toList()
    println(result)
}