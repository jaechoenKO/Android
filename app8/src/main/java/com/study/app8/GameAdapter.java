package com.study.app8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// ItemView.JAVA를 생성 했을 시
// 기본적으로 BaseAdapter를 상속 받아야 한다. BaseAdapter는 추상 클래스
public class GameAdapter extends BaseAdapter{

    private Context mContext = null;
//    private ArrayList<GameData> gData = null; // gameData.JAVA 이용. ItemView.JAVA가 없을 시
    private ArrayList<GameData> gData = new ArrayList<>(); // gameData.JAVA 이용. ItemView.JAVA가 있을 시

    public GameAdapter(Context context){

        this.mContext = context;

    }

    // ItemView.JAVA가 있을 시, item을 추가 해주어야 된다. 데이터 추가 메소드.
    public void addItem(GameData gd){
        gData.add(gd);
    }

    // 어댑터에서 관리하는 아이템의 갯 수, GameData의 갯 수. 즉 아이템의 갯수 얻어와 리턴하는 메소드 display되기 전에 실행.
    public int getCount(){
        // 아이템은 index로 구분. 사용하기 위해선 전체 아이템 갯 수를 알아야 관리가 된다. 갯 수가 잘못 리턴되면 화면에 이상하게 보인다.
        return gData.size(); // GameData의 갯 수.
    }

    // title 값을 돌려준다.
    @Override
    public Object getItem(int position) {
        /*
        *  getCount를 가져오면 gData의 갯 수를 알 수 있다. 그 갯 수는 int 라는 posotion을 이용하게 된다. 만약 화면의 뿌려질 갯 수는 5개라면 첫 번째는 0부터 시작.
        *  즉 position은 위치를 알 수 있다. 그래서 getCount를 얻어온다.
        * */
        return gData.get(position).getTitle();
    }

    // 해당 아이템을 얻어오기 위해서 선택한 아이템의 포지션을 알아야한다. 즉 화면의 위치 값을 얻어오는 메소드
    @Override
    public long getItemId(int position) {
        return position;
    }

    /*
    *   view를 리턴해주는 메소드
    *   position : 해당 아이템에 대한 아이디. 아이템을 식별하기 위한 색인.
    *   converView : 현재 position에 해당하는 뷰 객체를 의미. 즉 현재 인덱스에 해당하는 객체. 즉 아이템임을 의미한다.
    *   parent : converView를 포함하고 있는 부모 컨테이너 객체.
    */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ItemView itemView;

        // 화면에 보여질 converView
        if(convertView == null){ // 뷰가 없을 때.
            itemView = new ItemView(mContext, gData.get(position));
        }else {
            // 만들어 진 데이터를 그대로 이용. 해당 convertView를 itemView로 바꾸어줌.
            itemView = (ItemView)convertView; // 재활용 하는 부분
        }

        // gData의 position 값으로 적용.
        itemView.setIcon(gData.get(position).getIcon());
        itemView.setTitle(gData.get(position).getTitle());
        itemView.setComment(gData.get(position).getComment());


        // 홀수 아이템 일 때 백그라운드 컬러 변경
        if(position%2 == 1){
            // 16진수
//            convertView.setBackgroundColor(0x80000ff);
            itemView.setBackgroundColor(0x80000ff);
        }else{
//            convertView.setBackgroundColor(0x200000ff);
            itemView.setBackgroundColor(0x200000ff);
        }
//        return convertView; // convertView를 정의하지 않고 작업하고 있다.
        // itemView 리턴한다.
        return itemView; // convertView를 정의하지 않고 작업하고 있다.
    }

}

// ItemView.JAVA를 안만들었을 시
// 기본적으로 BaseAdapter를 상속 받아야 한다. BaseAdapter는 추상 클래스
/*public class GameAdapter extends BaseAdapter{

    private Context mContext = null;
    private int layout = 0; // 레이아웃 객체
    private ArrayList<GameData> gData = null; // gameData.JAVA 이용.
    private LayoutInflater inflater = null; // xml의 정의 된 내용은 객체화 된 것이 아니라 이렇게 사용 할 것이다라고 정의 한것. 정의 된 것을 객체화 하는 것을 인플레이터.

    public GameAdapter(Context context, int layout, ArrayList<GameData> gData){

        this.mContext = context;
        this.layout = layout;
        this.gData = gData;
        *//*
            서비스에서 제공. 사용자에게 보이진 않지만 백그라운드에서 돌아간다 이런 것을 서비스라고 함. 인플레이터는 그중에 하나. context의 getSystemService 메소드에서 얻을 수 있다.
            LayoutInflater라고 캐스팅 해주어야 한다.
        *//*
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    // 어댑터에서 관리하는 아이템의 갯 수, GameData의 갯 수. 즉 아이템의 갯수 얻어와 리턴하는 메소드 display되기 전에 실행.
    public int getCount(){
        // 아이템은 index로 구분. 사용하기 위해선 전체 아이템 갯 수를 알아야 관리가 된다. 갯 수가 잘못 리턴되면 화면에 이상하게 보인다.
        return gData.size(); // GameData의 갯 수.
    }

    // title 값을 돌려준다.
    @Override
    public Object getItem(int position) {
        *//*
         *  getCount를 가져오면 gData의 갯 수를 알 수 있다. 그 갯 수는 int 라는 posotion을 이용하게 된다. 만약 화면의 뿌려질 갯 수는 5개라면 첫 번째는 0부터 시작.
         *  즉 position은 위치를 알 수 있다. 그래서 getCount를 얻어온다.
         * *//*
        return gData.get(position).getTitle();
    }

    // 해당 아이템을 얻어오기 위해서 선택한 아이템의 포지션을 알아야한다. 즉 화면의 위치 값을 얻어오는 메소드
    @Override
    public long getItemId(int position) {
        return position;
    }

    *//*
     *   view를 리턴해주는 메소드
     *   position : 해당 아이템에 대한 아이디. 아이템을 식별하기 위한 색인.
     *   converView : 현재 position에 해당하는 뷰 객체를 의미. 즉 현재 인덱스에 해당하는 객체. 즉 아이템임을 의미한다.
     *   parent : converView를 포함하고 있는 부모 컨테이너 객체.
     *//*
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 화면에 보여질 converView
        if(convertView == null){ // 뷰가 없을 때.
            *//*
             *  보여질 뷰가 없으면 생성 해야한다. inflater의 객체를 이용한다.
             *  inflater에는 레이아웃이 들어가야한다.
             *  현재 레이아웃을 부모 컨테이너의 자식 뷰로 설정 할 것인가. 아니면 그대로 사용 할 것인가. true면 parent의 자식(this.layout)으로 설정.
             *  루트에 있는 레이아웃 파라미터를 생성 할 때만 사용할 경우는 false
             * *//*
            convertView = inflater.inflate(this.layout, parent, false);
        }

        // 안드로이드는 만들어 놓은 converView를 하나 만들어 놓으면 재사용한다.

        // gamelist에 정의 된 데이터 가져오기
        // ImageView ico = findViewById(R.id.ico_game); 우리가 얻어 올 땐 MainActivity에서 얻어 왔다. 하지만 convertView의 해당 아이템의 스타일을 정의한 xml에서 가져와야한다. 해당 아이템의 스타일이기 때문에.
        // JAVA파일에서 convertView를 정의하지 않았다. 따라서 convertView를 이용하여 아이디 값을 가져온다.
        ImageView ico = convertView.findViewById(R.id.ico_game);
        TextView gTitle = convertView.findViewById(R.id.txt_title);
        TextView gComment = convertView.findViewById(R.id.txt_comment);
        Button btn = convertView.findViewById(R.id.btn_select);
        // 위의 작업 내용은 뷰 객체를 정의하지 않아서 하고 있는 것.

        *//*
         * 이미지 가져오기. 해당 포지션에 해당하는 이미지를 가져와야 한다.
         * *//*
        ico.setImageResource(gData.get(position).getIcon());
        gTitle.setText(gData.get(position).getTitle());
        gComment.setText(gData.get(position).getComment());

        // 홀수 아이템 일 때 백그라운드 컬러 변경
        if(position%2 == 1){
            // 16진수
            convertView.setBackgroundColor(0x80000ff);
        }else{
            convertView.setBackgroundColor(0x200000ff);
        }

        // convertView를 리턴한다.
        return convertView; // convertView를 정의하지 않고 작업하고 있다.
    }

}*/
