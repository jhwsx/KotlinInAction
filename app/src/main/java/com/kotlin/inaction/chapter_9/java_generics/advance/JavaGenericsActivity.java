package com.kotlin.inaction.chapter_9.java_generics.advance;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @date 2019/11/01
 */
public class JavaGenericsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        List<TextView> textViews = new ArrayList<>();
        // List<TextView> textViews1 = new ArrayList<Button>(); // 编译报错
//        List<? extends TextView> textViews1 = new ArrayList<Button>();
//        TextView textView = textViews1.get(0);
//        textViews1.add(new Button(this));
//        List<Button> buttons = new ArrayList<>();
//        printTexts(buttons);

        TextView[] textViewArray = new TextView[4];
        TextView[] textViewArr = new Button[5];

        List<? super Button> textViews = new ArrayList<TextView>();
        Object object = textViews.get(0);
        textViews.add(new Button(this));
    }

    public void printTexts(List<? extends TextView> textViews) {
        for (TextView textView : textViews) {
            System.out.println(textView.getText());
        }

    }
}

// 协变：子类的泛型类型也属于泛型类型的子类
// Java 的泛型本身具有不可变性，Java 认为 List<Button> 和 List<TextView> 类型并不一致，也就是说，
// 子类的泛型 List<Button> 并不属于泛型 List<TextView> 的子类。也就说，不允许把子类的泛型类型声明
// 赋值给父类的泛型类型声明。
