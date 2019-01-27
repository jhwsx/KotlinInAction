package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/22
 */
open class Button8 // 没有声明构造方法，将会生成一个不做任何事情的默认构造方法

class RadioButton: Button8() // 必须显式地调用父类的构造方法，所以Button6后面有个括号

/**
 * 总结：
 * 1，继承一个类与实现一个接口的区别：
 * 接口没有构造方法，在实现一个接口的时候，不需要在父类型列表中它的名称后面再加上括号
 * 类有构造方法，在继承一个类的时候，必须在父类型列表中它的名称后面再加上括号。
 */

