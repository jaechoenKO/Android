package com.study.app8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // 데이터를 만들어 처리
    // 어댑터를 만들었기 때문에 리스트뷰에 세팅만 해주면 된다.

    private ArrayList<GameData> data = null; // 데이터
    private GameAdapter gAdapter = null; // 어댑터
    private ListView listView = null; // 어댑터 뷰(리스트 뷰)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 어댑터 세팅 ItemView.JAVA가 있을 시, 어댑터를 미리 만들어야 한다. 이미 만들어져 있는 것을 가져오기 때문에.
        gAdapter = new GameAdapter(this); // 생성자를 이용해서, 리스트 뷰도 만들어 주고, 데이터도 추가.


        // ItemView.JAVA가 없을 시
/*        data = new ArrayList<GameData>();

        // 어댑터에 데이터 추가
        data.add(new GameData(R.drawable.icon, "BaseBall", "메이저 리그 게임"));
        data.add(new GameData(R.drawable.icon, "Premier League", "프리미어 리그 게임"));
        data.add(new GameData(R.drawable.icon, "K-League", "케이 리그 게임"));
        data.add(new GameData(R.drawable.icon, "Piano Tiles", "피아노 게임"));
        data.add(new GameData(R.drawable.icon, "Game 1", "게임 1"));
        data.add(new GameData(R.drawable.icon, "Game 2", "게임 2"));
        data.add(new GameData(R.drawable.icon, "Game 3", "게임 3"));
        data.add(new GameData(R.drawable.icon, "Game 4", "게임 4"));
        data.add(new GameData(R.drawable.icon, "Game 5", "게임 5"));
        */

        // 어댑터 세팅 ItemView.JAVA가 없을 시
//        gAdapter = new GameAdapter(this, R.layout.gamelist, data);


        // 어댑터에 데이터 추가
        gAdapter.addItem(new GameData(R.drawable.icon, "BaseBall", "메이저 리그 게임"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Premier League", "프리미어 리그 게임"));
        gAdapter.addItem(new GameData(R.drawable.icon, "K-League", "케이 리그 게임"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Piano Tiles", "피아노 게임"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Game 1", "게임 1"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Game 2", "게임 2"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Game 3", "게임 3"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Game 4", "게임 4"));
        gAdapter.addItem(new GameData(R.drawable.icon, "Game 5", "게임 5"));

        listView = findViewById(R.id.lv01);

        // 리스트 뷰에 세팅
        listView.setAdapter(gAdapter);

    }
}
