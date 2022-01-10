package com.kotlin.inaction.chapter_3

/**
 * 成员扩展函数
 * 只能在它所属的类里面被调用，不可以到外面调用。
 * @author wzc
 * @date 2019/1/12
 */
fun main(args: Array<String>) {
    Connection(Host("kotl.in"), 443).connect()
}

class Host(val hostname: String) {
    fun printHostname() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() {
        print(port)
    }
    // 在另外一个类中声明一个类的扩展函数
    // 查看对应的 java 代码是把 Host 对象传入了 printConnectionString() 方法而已
//    public final void printConnectionString(@NotNull Host $this$printConnectionString) {
//        Intrinsics.checkNotNullParameter($this$printConnectionString, "$this$printConnectionString");
//        $this$printConnectionString.printHostname();
//        String var2 = ":";
//        boolean var3 = false;
//        System.out.print(var2);
//        this.printPort();
//    }
    // 这时 Connection 对象就是 dispatcher receiver，Host 对象就是 extension receiver 了。
    fun Host.printConnectionString() {
        printHostname() // 可以直接调用 host 对象的成员函数了。
        print(":")
        printPort()
    }

    fun connect() {
        host.printConnectionString()
    }
}