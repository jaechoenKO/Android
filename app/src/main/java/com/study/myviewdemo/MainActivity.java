package com.study.myviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // 뷰를 만들 때에는 항상 Context가 들어가야한다.
        Custom custom = new Custom(this);

        setContentView(custom);

    }
}
