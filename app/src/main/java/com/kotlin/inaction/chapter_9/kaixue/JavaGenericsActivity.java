package com.kotlin.inaction.chapter_9.kaixue;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
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
//        TextView textView = new Button(this);

//        List<Button> buttons = new ArrayList<>();
//        List<TextView> textViews = buttons; // 编译错误: 类型不匹配

//        Button[] buttons1 = new Button[10];
//        TextView[] textViews1 = buttons1;

//        List<Button> buttons = new ArrayList<>();
//        List<? extends TextView> textViews = buttons;

//        List<? extends TextView> textViews = new ArrayList<>();
//        List<? extends TextView> textViews = new ArrayList<Button>();
//        List<? extends TextView> textViews = new ArrayList<RadioButton>();

//        List<? extends TextView> textViews = new ArrayList<Button>();
//        TextView textView = textViews.get(0);
//        textViews.add(textView); // 编译报错: 只知道可以存入 TextView 的子类型,但不确定.


//        List<? super Button> buttons = new ArrayList<TextView>();

//        List<? super Button> buttons = new ArrayList<Button>();
//        List<? super Button> buttons = new ArrayList<TextView>();
//        List<? super Button> buttons = new ArrayList<Object>();

        List<? super Button> buttons = new ArrayList<TextView>();
        Object object = buttons.get(0);
        Button button = new Button(this);
        buttons.add(button);

    }


}

