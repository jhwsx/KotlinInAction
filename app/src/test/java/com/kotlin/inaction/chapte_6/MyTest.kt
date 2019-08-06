//package com.kotlin.inaction.chapte_6
//
//import org.junit.Assert
//import org.junit.Before
//import org.junit.Test_TypeParameterConstraints
//
///**
// *
// * @author wzc
// * @date 2019/3/12
// */
//class MyTest {
//    private var myService: MyService? = null
//
//    @Before fun setUp() {
//        myService = MyService()
//    }
//
//    @Test_TypeParameterConstraints fun testAction() {
//        Assert.assertEquals("foo", myService!!.performAction())
//    }
//}