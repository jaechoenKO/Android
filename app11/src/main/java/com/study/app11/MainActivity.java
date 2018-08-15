package com.study.app11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    // 이미지 변수
    private int[] imgData = {R.drawable.g1, R.drawable.g2,R.drawable.g3,
            R.drawable.g4, R.drawable.g5};

    // 리니어 레이아웃 객체
    private LinearLayout lv;

    // 만들어진 커스텀 어댑터 객체
    private CustomAdapter adapter;

    // 그리드뷰 객체
    private GridView gv;

    // 이미지를 저장 시킬 변수
    private ImageView[] ivs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      scrollview는 어댑터를 만들 필요가 없다
        adapter = new CustomAdapter(this, imgData);
        gv = findViewById(R.id.gv01);
        gv.setAdapter(adapter);

        lv = findViewById(R.id.lv01);

        // 리니어 레이아웃 안에 이미지 뷰가 들어가야한다.
        ivs = new ImageView[5];
        for(int i = 0; i < 5; i++){
            ivs[i] = new ImageView(this);
            ivs[i].setImageResource(imgData[i]);
            lv.addView(ivs[i]);
        }
    }
}
