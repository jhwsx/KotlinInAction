package com.kotlin.inaction.chapter_4;

/**
 * @author wangzhichao
 * @since 2020/6/23
 */
public class JavaInterfaceTest {
    interface ClickableJava {
        double PI = 3.14159126; // 可以声明常量
        void click();
        default void showOff() {
            System.out.println("I'm clickable!");
        }
    }
    interface FocusableJava {
        default void setFocus(boolean b) {
            System.out.println("I " +(b ? "got" : "lost") + " focus");
        }
        default void showOff() {
            System.out.println("I'm focusable!");
        }
    }

    static class ButtonJava implements ClickableJava, FocusableJava {
        @Override
        public void click() {
            System.out.println("I was clicked");
        }

        @Override
        public void showOff() {
            ClickableJava.super.showOff();
            FocusableJava.super.showOff();
        }
    }

    static class ButtonImplementsKotlin implements Clickable2, Focusable {

        @Override
        public void click() {

        }

        @Override
        public void showOff() {

        }

        @Override
        public void setFocus(boolean b) {

        }
    }

    public static void main(String[] args) {
        ButtonJava buttonJava = new ButtonJava();
        buttonJava.showOff();
        buttonJava.setFocus(true);
        buttonJava.click();
    }
}

