//package com.kotlin.inaction.chapter_9
//
//import android.app.Activity
//import android.content.Context
//import android.content.Intent
//import java.util.*
//
///**
// *
// * @author wzc
// * @date 2019/8/11
// */
//data class Service(val name: String)
//
//fun main(args: Array<String>) {
//    val serviceImpl = ServiceLoader.load(Service::class.java)
//
//    val serviceImpl1 = loadService<Service>()
//}
//
//inline fun <reified T> loadService(): ServiceLoader<T> {
//    return ServiceLoader.load(T::class.java)
//}
//
//inline fun <reified T : Activity> Context.startActivity() {
//    val intent = Intent(this, T::class.java)
//    startActivity(intent)
//}
//
