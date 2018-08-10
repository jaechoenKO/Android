package com.study.app8;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// gamelist.xml 객체화 클래스 java class로 레이아웃 만들기
public class ItemView extends LinearLayout{

    private ImageView mIcon;
    private TextView mTitle;
    private TextView mComment;
//    private Button mBtn;

    // data값을 넣어야 하기 때문에 파라미터로 GameData를 넣는다.
    public ItemView(Context context, GameData gData) {
        super(context);

        // 인플레이션 작업, xml에 있는 내용을 메모리에 올려서 객체화 하는 과정.
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // LinearLayout의 자식이니 true 값을 넣어준다. (자체적으로 가져오니까 꼭 자식이 될 필요는 없다.)
        inflater.inflate(R.layout.gamelist, this, true);

        // set Icon
        mIcon = findViewById(R.id.ico_game);
        mIcon.setImageResource(gData.getIcon());

        // set Title
        mTitle = findViewById(R.id.txt_title);
        mTitle.setText(gData.getTitle());

        // set Comment
        mComment = findViewById(R.id.txt_comment);
        mComment.setText(gData.getComment());

        // 인플레이션 과정 끝.

    }

    // 데이터 세팅 메소드들
    public void setIcon(int icon){ // GameData.JAVA를 보면 icon은 int.
        mIcon.setImageResource(icon);
    }

    public void setTitle(String data){ // GameData.JAVA를 보면 text 부분은 String.
        mTitle.setText(data);
    }

    public void setComment(String data){
        mComment.setText(data);
    }

}
