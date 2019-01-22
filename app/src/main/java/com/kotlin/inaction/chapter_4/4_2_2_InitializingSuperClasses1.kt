package com.kotlin.inaction.chapter_4

import android.content.Context
import android.util.AttributeSet

/**
 *
 * @author wzc
 * @date 2019/1/23
 */
open class View1 {
    constructor(ctx: Context)

    constructor(ctx: Context, attr: AttributeSet?)
}

class MyButton : View1 {
    constructor(ctx: Context) : super(ctx) { // 从构造方法

    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) { // 调用父类的构造方法

    }
}

class MyButton2 : View1 {
    constructor(ctx: Context) : this(ctx, null){ // 委托给另一个本类的构造方法

    }

    constructor(ctx: Context, attr: AttributeSet?) : super(ctx, attr) {

    }
}

/**
 * 总结：
 * 1，主构造方法和从构造方法的区别：
 * 一个类可以不声明主构造方法，主构造方法的特征是在类头部的类名后面有括号；
 * 一个类可以声明多个从构造方法，从构造方法的特征是在类体中使用constructor关键字引出
 * 2，如果类没有主构造方法，那么每个从构造方法必须初始化基类或者委托给另一个这样做了的构造方法。
 */