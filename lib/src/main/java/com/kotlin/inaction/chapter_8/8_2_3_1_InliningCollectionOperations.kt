package com.kotlin.inaction.chapter_8

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
data class Person1(val name: String, val age: Int)

fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    // filter 函数是一个内联函数，这意味着 filter 函数，以及传递给 filter 的 lambda 的字节码都会内联到调用
    // filter 的地方。
    println(people.filter { it.age < 30 })
}
/*
public final class _8_2_3_1_InliningCollectionOperationsKt {
   public static final void main() {
      List people = CollectionsKt.listOf(new Person1[]{new Person1("Alice", 29), new Person1("Bob", 31)});
      Iterable $this$filter$iv = (Iterable)people;
      int $i$f$filter = false;
      Collection destination$iv$iv = (Collection)(new ArrayList());
      int $i$f$filterTo = false;
      Iterator var6 = $this$filter$iv.iterator();

      while(var6.hasNext()) {
         Object element$iv$iv = var6.next();
         Person1 it = (Person1)element$iv$iv;
         int var9 = false;
         if (it.getAge() < 30) {
            destination$iv$iv.add(element$iv$iv);
         }
      }

      List var10 = (List)destination$iv$iv;
      $i$f$filter = false;
      System.out.println(var10);
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
}
*/