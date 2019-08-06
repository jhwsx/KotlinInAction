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
//class MyLateinitTest {
//    private lateinit var myService: MyService
//
//    @Before fun setUp() {
//        myService = MyService()
//    }
//
//    @Test_TypeParameterConstraints fun testAction() {
//        Assert.assertEquals("foo", myService.performAction())
//    }
//}
//
///**
// * 总结：
// * 1，lateinit 修饰符，修饰的属性都是 var，作用是延迟初始化；
// * 2，如果注释掉第 16 行代码不初始化，那么运行会抛出异常
// * kotlin.UninitializedPropertyAccessException: lateinit property myService has not been initialized
// */