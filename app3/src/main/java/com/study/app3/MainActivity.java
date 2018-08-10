package com.study.app3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        CustomView customView = new CustomView(this);
        CustomView2 customView2 = new CustomView2(this);
        setContentView(customView2);

    }
}
