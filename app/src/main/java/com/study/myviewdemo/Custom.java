package com.study.myviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

// View를 상속을 받아야 한다.
public class Custom extends View{

    public Custom(Context context){
        super(context);

    }

    // 화면에 그림을 그리는 메소드, view에서 onDraw 메소드를 오버라이딩 할 수 있다.
    // onDraw는 view가 화면에 나타날 때 자동으로 호출.
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.YELLOW); // 노란색으로 칠함.

        // 도형 그리기
        Paint paint = new Paint();
        paint.setColor(Color.RED); // 색 설정

        // 원그리기, cx, cy : 좌표값, radius 반지름
        canvas.drawCircle(500, 500, 300, paint);

        paint.setColor(Color.GREEN);
        canvas.drawCircle(500, 800, 200, paint);

        // 사각형, 첫번째 꼭지점, 마지막 꼭지점 값을 넣는다.
        //paint.setColor(Color.BLUE);
        paint.setColor(0x8000ff00); // 16진수
        canvas.drawRect(200, 200, 600, 500, paint);

        // 선그리기
        paint.setColor(Color.BLACK);
        canvas.drawLine(100, 200, 800, 800, paint);

        paint.setColor(Color.RED);
        canvas.drawPoint(900, 900, paint);
    }

}
