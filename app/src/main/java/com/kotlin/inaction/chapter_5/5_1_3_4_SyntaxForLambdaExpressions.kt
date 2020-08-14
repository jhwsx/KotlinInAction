package com.kotlin.inaction.chapter_5

/**
 *
 * @author wzc
 * @date 2019/1/31
 */
fun main(args: Array<String>) {
    val people = listOf<Person>(Person("Alice", 29), Person("Bob", 31))
    // 简明语法的写法
    println(people.maxBy { it.age })
    // 匿名函数的写法
    println(people.maxBy(fun(p: Person): Int {
        return p.age
    }))
    // 不使用任何简明语法的写法
    println(people.maxBy({ p: Person -> p.age }))
    // 对于不使用任何简明语法的写法进行优化
    // 拿花括号开刀，因为 kotlin 有语法约定，如果 lambda 表达式是函数调用的最后一个实参，它可以放到括号的外边。
    println(people.maxBy() { p: Person -> p.age })
    // 拿空圆括号开刀，因为在 kotlin 中，当 lambda 是函数唯一的实参时，还可以去掉调用代码中的空括号对
    println(people.maxBy { p: Person -> p.age })
    // 拿类型参数开刀，因为这里编译器可以推导出类型参数
    println(people.maxBy { p -> p.age })
    // 拿命名参数开刀，如果当前上下文期望的是只有一个参数的 lambda 且这个参数的类型可以推断出来，就会生成默认参数 it
    println(people.maxBy { it.age })

    // 用变量存储 lambda
    val getAge = {p: Person -> p.age}
    println(people.maxBy(getAge))

}

/**
 * 总结：
 * 1, it 默认参数仅在实参名称没有显式地指定时这个默认的名称才会生成。
 * 2，不要滥用 it 默认参数，在嵌套 lambda 的情况下不要用。
 * 3，用变量存储 lambda，就没有可以推断出参数类型的上下文，就必须显式地指定参数类型。当然了，不能用 it 了。
 */