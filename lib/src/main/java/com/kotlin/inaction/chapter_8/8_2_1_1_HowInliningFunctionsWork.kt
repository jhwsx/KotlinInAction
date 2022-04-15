package com.kotlin.inaction.chapter_8

import java.util.concurrent.locks.Lock

/**
 *
 * @author wzc
 * @date 2019/6/3
 */
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}
// 查看对应的 Java 代码，理解内联的作用
fun foo(l: Lock) {
    println("Befor sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}
// 不内联对应的 Java 代码
/*
public static final void foo(@NotNull Lock l) {
   Intrinsics.checkNotNullParameter(l, "l");
   String var1 = "Befor sync";
   boolean var2 = false;
   System.out.println(var1);
   synchronized(l, (Function0)null.INSTANCE);
   var1 = "After sync";
   var2 = false;
   System.out.println(var1);
}
*/
// 内联对应的 Java 代码
/*
public static final void foo(@NotNull Lock l) {
   Intrinsics.checkNotNullParameter(l, "l");
   String var1 = "Befor sync";
   boolean var2 = false;
   System.out.println(var1);
   int $i$f$synchronized = false;
   l.lock();
   try {
      var2 = false;
      String var3 = "Action";
      boolean var4 = false;
      System.out.println(var3);
      Unit var8 = Unit.INSTANCE;
   } finally {
      l.unlock();
   }
   var1 = "After sync";
   var2 = false;
   System.out.println(var1);
}
 */

/**
 * 总结：
 * 1，这个例子中 synchronized 函数的实现 和 lambda 表达式都会被内联;
 * 2, lambda 生成的字节码会成为函数调用者的一部分，而不是被包含在一个实现了函数接口的匿名内部类中。
 */
