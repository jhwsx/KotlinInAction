package com.kotlin.inaction.chapter_4;

import org.jetbrains.annotations.NotNull;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author wzc
 * @date 2019/1/19
 */
public class Button6 implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public class ButtonState implements State {
    }

    public static void main(String[] args) {
        Button6 button6 = new Button6();
        ButtonState buttonState = button6.new ButtonState();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            oos.writeObject(buttonState);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/**
 * java.io.NotSerializableException: com.kotlin.inaction.chapter_4.Button6
 * 	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
 * 	at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
 * 	at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
 * 	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
 * 	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
 * 	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
 * 	at com.kotlin.inaction.chapter_4.Button6.main(Button6.java:33)
 */
