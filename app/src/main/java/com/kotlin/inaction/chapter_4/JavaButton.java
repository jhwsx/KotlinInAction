package com.kotlin.inaction.chapter_4;

/**
 * @author wzc
 * @date 2019/9/2
 */
public class JavaButton implements Focusable, Clickable {
    @Override
    public void setFocus(boolean b) {
        System.out.println("setFocus");
    }

    @Override
    public void showOff() {
        System.out.println("showOff");
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    public static void main(String[] args) {
        JavaButton javaButton = new JavaButton();
        javaButton.setFocus(true);
        javaButton.showOff();
        javaButton.click();
    }


}

/**
 * 总结：
 * 1，在 Java 中实现 Kotlin 的接口的例子，默认的实现都没有用了，只剩下接口而已了。
 */
