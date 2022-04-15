package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    foo({
        println("inlined block")
    }) {
        println("notInlined block")
    }
}
// 一个函数有个两个或更多 lambda 参数，可以选择只内联其中一些参数
// 非内联的 lambda 参数使用 noinline 修饰符来标记它
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit): Unit {
    inlined()
    notInlined()
}

// 查看对应的 Java
/*
public final class _8_2_2_2_InliningFunctionLimitKt {
   public static final void main() {
      Function0 notInlined$iv = (Function0)null.INSTANCE; // 不内联的 lambda 参数编译成了匿名接口的内部类
      int $i$f$foo = false;
      int var2 = false;
      String var3 = "inlined block";
      boolean var4 = false;
      System.out.println(var3);
      notInlined$iv.invoke();
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }

   public static final void foo(@NotNull Function0 inlined, @NotNull Function0 notInlined) {
      int $i$f$foo = 0;
      Intrinsics.checkNotNullParameter(inlined, "inlined");
      Intrinsics.checkNotNullParameter(notInlined, "notInlined");
      inlined.invoke();
      notInlined.invoke();
   }
}
*/
