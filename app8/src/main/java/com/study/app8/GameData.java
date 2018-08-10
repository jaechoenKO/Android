package com.study.app8;

// 데이터를 정의하는 클래스
public class GameData {

    private int icon; // int 형으로 한다는 의미는 drawable 객체 안에 있는 (참조) 할 때는 정수형으로 해당 이미지를 참조한다.
    private String title;
    private String comment;

    public GameData( int icon, String title, String comment){

        this.icon = icon;
        this.title = title;
        this.comment = comment;

    }

    // 데이터를 가져오는 메소드들
    public int getIcon(){ // icon
        return icon;
    }

    public String getTitle(){ // 제목
        return title;
    }


    public String getComment(){ // 내용
        return comment;
    }

}
