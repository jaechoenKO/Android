package com.study.app4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 어댑터 연결 : 데이터 -> 어댑터 -> 어댑터 뷰

    // 데이터 담기 위한 변수
    ArrayList<String> arrayList = null;
    // array 어댑터 변수 -> 어댑터 뷰와 연결하기 위한 변수
    ArrayAdapter<String> adapter = null;
    //ListView 변수, 리스트 뷰는 가장 많이 사용하는 뷰.
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // arraylist에 데이터 추가, 데이터 영역
        arrayList = new ArrayList<String>();
        arrayList.add("김말똥");
        arrayList.add("이말똥");
        arrayList.add("홍길동");
        arrayList.add("김길동");
        arrayList.add("이길북");
        arrayList.add("강길서");
        arrayList.add("김길남");
        arrayList.add("강호동");
        arrayList.add("김말똥");
        arrayList.add("이말똥");
        arrayList.add("홍길동");
        arrayList.add("김길동");
        arrayList.add("이길북");
        arrayList.add("강길서");
        arrayList.add("김길남");
        arrayList.add("강호동");

        /*
            어댑터 생성, context가 들어가야함. 스타일을 지정해주어야한다.
            스타일을 하나 지정하면 지속적으로 사용할 수 있다.
            android.R.layout.simple_list_item_1 : 안드로이드에서 기본적으로 제공해주는 스타일
            (context, style, arraylist)
        */
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList); // 어댑터

        lv = findViewById(R.id.lv1); // 어댑터 뷰
        // 어댑터 세팅, 즉 데이터와 어댑터를 연결
        lv.setAdapter(adapter);
    }
}
