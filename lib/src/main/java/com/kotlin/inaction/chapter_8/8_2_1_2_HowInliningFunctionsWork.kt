package com.kotlin.inaction.chapter_8

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 *
 * @author wzc
 * @date 2019/6/3
 */
class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        // 使用函数类型的变量 body 作为内联函数 synchronized 的参数
        // 在这种情况下，lambda 的代码在内联函数被调用点是不可用的，因此不会被内联
        synchronized(lock, body)
    }
}
// 对应的 Java
/*
public final class LockOwner {
   @NotNull
   private final Lock lock;
   public final void runUnderLock(@NotNull Function0 body) {
      Intrinsics.checkNotNullParameter(body, "body");
      Lock lock$iv = this.lock;
      int $i$f$synchronized = false;
      lock$iv.lock();
      try {
         Object var4 = body.invoke(); // body 并没有被内联。
      } finally {
         lock$iv.unlock();
      }
   }
   @NotNull
   public final Lock getLock() {
      return this.lock;
   }
   public LockOwner(@NotNull Lock lock) {
      Intrinsics.checkNotNullParameter(lock, "lock");
      super();
      this.lock = lock;
   }
}
*/

fun main(args: Array<String>) {
    LockOwner(ReentrantLock()).run { println("Hello") }
}

/**
 * 总结：
 * 1，这个例子调用了 synchronized 函数这个内联函数，但是传递了函数类型的变量作为参数；
 * 2，这时，lambda 的代码在内联函数被调用点是不可用的，因此不会被内联。
 */
