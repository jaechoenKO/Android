package com.study.app7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> adapter = null;
    Spinner spinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_spinner_item);
        // setDropDownViewResource을 이용하여 세팅.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = findViewById(R.id.sp1);
        // spinner 세팅, setPrompt 공간이 부족할 때 공간을 폈다 접었다.
       // spinner.setPrompt(getString(R.string.country_select)); // 바에 들어갈 내용
        spinner.setAdapter(adapter);
    }
}
