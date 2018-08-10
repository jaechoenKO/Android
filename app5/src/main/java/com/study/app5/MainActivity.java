package com.study.app5;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> arrayAdapter = null;
    ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Required:ArrayAdapter<java.lang.String>
        * Found:ArrayAdapter<java.lang.CharSequence>
        * string으로 선언하면 이런 에러가 나오는데 Charsequence로 선언하면 된다.
        * */
        // 데이터를 data.xml에서 선언하였기 때문에 소스가 더욱 간결 해졌다.
        //arrayAdapter = ArrayAdapter.createFromResource(this, R.array.contact, android.R.layout.simple_list_item_1);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.contact, android.R.layout.simple_list_item_checked);

        listView = findViewById(R.id.lv);
        listView.setAdapter(arrayAdapter);

        // 하나만 선택 가능
        //listView.setChoiceMode(listView.CHOICE_MODE_SINGLE);
        // 여러개 선택 가능
        listView.setChoiceMode(listView.CHOICE_MODE_MULTIPLE);

        // colorDrawable이라는 객체가 있다.
        ColorDrawable colorDrawable = new ColorDrawable(Color.RED);
        // listView 선색 변경. 이것을 디바이더라고 함.
        listView.setDivider(colorDrawable);
        // 리스트뷰 선의 두깨.
        listView.setDividerHeight(5);

    }
}
