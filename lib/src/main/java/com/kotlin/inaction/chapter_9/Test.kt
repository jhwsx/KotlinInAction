//package com.kotlin.inaction.chapter_9
//
///**
// * https://discuss.kotliner.cn/t/topic/1716/3
// * @author wangzhichao
// * @since 2022/4/17
// */
//typealias EventHandler1<T> = T.() -> Unit
//typealias EventHandler2<T> = AS<T>
//
//// 不可以进行协变和逆变
//class AS<T> {}
//
//class Event<in T : Number> {
//
//    fun inT1(x: T) {}
//
//    // T 在 out 位置了
//    fun inT2(x: (T) -> Unit) {}
//
//    // T 在 out 位置了
//    fun inT3(x: Event<T>) {}
//
//    fun x(handler: AS<out T>) {}
//
//    fun y1(handler: EventHandler1<T>) {}
//
//    fun y2(handler: EventHandler1<out T>) {}
//
//    fun z(handler: EventHandler2<out T>) {}
//}
//
//open class Base<T> {
//    open fun inT2(x: (T)->Unit) {}
//}
//
//class Impl<T>: Base<T>() {
//    override fun inT2(x: (T) -> Unit) {
//    }
//}
//
//fun main() {
//
//}
