package com.study.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int txtIndex = 0;

    // 텍스트 변수
    private TextView txtView01;
    private TextView txtView02;
    private TextView txtView03;

    // 버튼 변수
    private Button btnPrev;
    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id 찾아오기
        txtView01 = findViewById(R.id.txt1);
        txtView02 = findViewById(R.id.txt2);
        txtView03 = findViewById(R.id.txt3);

        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);

        // 리스너 등록 해당 엑티비티에서 상속을 받고 있어 this를 써주면 된다.
        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        // 이벤트가 발생하면 view에서 id값을 가져와야 한다.
        switch (v.getId()){
            case R.id.btnPrev:
                // indext 값을 이용한다. 0은 첫번째 인덱스, 1은 두번째 인덱스, 2는 세번째 인덱스
                if(txtIndex > 0 ){
                    txtIndex--;
                }
                changeView();
                break;
            case R.id.btnNext:
                if(txtIndex < 2){
                    txtIndex++;
                }
                changeView();
                break;
                default: break;
        }

    }

    private void changeView(){
        // 2,3 번째 뷰는 보이지 않게
        if(txtIndex == 0){
            txtView01.setVisibility(View.VISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.INVISIBLE);
        }else if(txtIndex == 1){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.VISIBLE);
            txtView03.setVisibility(View.INVISIBLE);
        }else if(txtIndex == 2){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.VISIBLE);
        }else{
            System.out.println("해당 값 없음");
        }
    }
}
