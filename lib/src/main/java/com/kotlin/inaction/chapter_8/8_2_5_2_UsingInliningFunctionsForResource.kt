package com.kotlin.inaction.chapter_8

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import kotlin.concurrent.withLock

/**
 *
 * @author wangzhichao
 * @since 2022/4/15
 */
fun main() {
    println(readFirstLineFromFile("local.properties"))
}
// use 是 Closable 接口的扩展函数，也是一个 inline 函数，用来操作可关闭的资源。
fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        // 思考一下：这个 lambda 里面为什么有个 return 呢？
        return br.readLine()
    }
}

/*
public static final String readFirstLineFromFile(@NotNull String path) {
   Intrinsics.checkNotNullParameter(path, "path");
   Closeable var1 = (Closeable)(new BufferedReader((Reader)(new FileReader(path))));
   boolean var2 = false;
   boolean var3 = false;
   Throwable var11 = (Throwable)null;
   String var6;
   try {
      BufferedReader br = (BufferedReader)var1;
      int var5 = false;
      String var10000 = br.readLine();
      Intrinsics.checkNotNullExpressionValue(var10000, "br.readLine()");
      var6 = var10000;
   } catch (Throwable var9) {
      var11 = var9;
      throw var9;
   } finally {
      CloseableKt.closeFinally(var1, var11);
   }
   return var6;
}
*/
