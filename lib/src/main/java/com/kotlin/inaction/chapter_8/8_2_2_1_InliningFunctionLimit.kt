package com.kotlin.inaction.chapter_8

import java.util.*

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    val list = listOf("one", "two")
    println(list.asSequence().map { it.uppercase(Locale.getDefault()) }.toList())
}
// 因为 lambda 参数是作为 TransformingSequence 的构造方法的参数被保存为一个属性，所以这个 lambda 没有被内联，而是
// 被编译成标准的非内联的表示法，即一个实现了函数接口的匿名类
// 编译后的 Java
/*
public final class _8_2_2_1_InliningFunctionLimitKt {
   public static final void main() {
      List list = CollectionsKt.listOf(new String[]{"one", "two"});
      List var1 = SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence((Iterable)list), (Function1)null.INSTANCE));
      boolean var2 = false;
      System.out.println(var1);
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
}
*/