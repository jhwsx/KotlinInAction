package com.kotlin.inaction.chapter_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author wzc
 * @date 2019/1/19
 */
public class NestingClassTest {
    public static void main(String[] args) {
        Button6 button6 = new Button6();
        State currentState = button6.getCurrentState();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/test/a.java");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(currentState);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}

/**
 * 报错信息：
 *
 * java.io.NotSerializableException: com.kotlin.inaction.chapter_4.Button6
 at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
 at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
 at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
 at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
 at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
 at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
 at com.kotlin.inaction.chapter_4.NestingClassTest.main(NestingClassTest.java:18)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:498)
 at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
 */

/**
 * 总结：
 * java中ButtonState类隐式地存储了它的外部类Button6
 */