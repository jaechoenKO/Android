package com.study.app6;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

// listActivity를 상속받으면 리스트 뷰를 구현하지 않아도됨
public class MainActivity extends ListActivity {

    ArrayList<String> data = null;
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // xml이 필요 없기 때문에 setContentView가 필요 없다.
        //setContentView(R.layout.activity_main);

        data = new ArrayList<String>();
        data.add("홍길동");
        data.add("김길동");
        data.add("홍길서");
        data.add("홍길동");
        data.add("김길동");
        data.add("홍길서");
        data.add("홍길동");
        data.add("김길동");
        data.add("홍길서");
        data.add("홍길동");
        data.add("김길동");
        data.add("홍길서");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        setListAdapter(adapter);
    }
}
