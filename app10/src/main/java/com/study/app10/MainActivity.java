package com.study.app10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    GalleryAdapter adapter; // 그냥 어댑터를 사용하면 에러가 날 수 있다. 커스텀 어댑터를 사용하니 정확하게 표시해야한다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new GalleryAdapter(this);

/*        // drawable에 있는 이미지를 galleryList에 추가하는 작업
        for(int i=1; i<6; i++){
            *//*
            * drawable에 있는 이미지 추가
            * getResources()를 통해서 지정 된 이미지를 가져 올 수 있다.
            * .getIdentifier() 지정 된 위치. 파일이름과 type, 패키지명이 필요하다.
            * *//*
            galleryList.add(getResources().getIdentifier("g"+i, "drawable", this.getPackageName()));
        }*/

        for(int i = 1; i < 6; i++){
            adapter.addItem(getResources().getIdentifier("g"+i, "drawable", this.getPackageName()));
        }

        final ImageView iv = findViewById(R.id.img01); // innerclass 에서 사용하기 위해. 전역 변수로 선언해도 됨.

        Gallery gallery = findViewById(R.id.gallery01);
        gallery.setAdapter(adapter);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // AdapterView<?> 뒤에 물음표는 어떤 타입이 들어와도 상관없다.
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { // AdapterView<?> adapterView: 해당 아이템을 클릭했을 때, i : 색인값, l : 아이디
                Integer galleryItem = adapter.getGalleryItem(i);
                iv.setImageResource(galleryItem);
            }
        });

    }
}
