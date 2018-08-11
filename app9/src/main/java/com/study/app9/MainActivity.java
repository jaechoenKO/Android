package com.study.app9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    // 배열 형태로 아이템 만듬.
    private int[] data = {R.drawable.doosan_mark, R.drawable.hanhwa_mark, R.drawable.kia_mark,
            R.drawable.kt_mark, R.drawable.lg_mark, R.drawable.lotte_mark, R.drawable.nc_mark, R.drawable.nexen_mark,
            R.drawable.samsung_mark, R.drawable.sk_mark};

    private CustomAdapter adapter; // 커스텀 맴버 선언 (커스텀 어댑터)
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter(this, data);

        gridView = findViewById(R.id.gv01);
        gridView.setAdapter(adapter);
    }
}
