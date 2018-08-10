package com.study.app2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CustomView extends View {

    private Paint paint;

    public CustomView(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint = new Paint();

        paint.setStyle(Paint.Style.FILL); // 꽉 채운다.
        paint.setColor(Color.RED);

        canvas.drawRect(100, 100, 200, 200, paint);

        // stroke 선
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        paint.setColor(Color.GREEN);

        canvas.drawRect(220, 100, 320, 200, paint);

        paint.setStyle(Paint.Style.FILL);
        // setColor 말고 ARGB로 색 넣기
        paint.setARGB(128, 255, 0, 0); // 128 : 반투명, 255 : 색
        canvas.drawRect(100, 220, 200, 320, paint);


        paint.setColor(Color.BLUE);
        canvas.drawCircle(400, 400, 200, paint);

        // 픽셀 단위이기 때문에 계단 현상이 발생. 계단 현상을 부드럽게 보여주기 위한 안티 엘리어싱
        paint.setAntiAlias(true);
        canvas.drawCircle(400, 800, 200, paint);

        // 텍스트를 이용하여 그리기
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setColor(Color.RED);
        paint.setTextSize(80);
        canvas.drawText("TEXT STROKE", 100, 800, paint); // 출력 문자와 위치를 적어야한다.



        // sytle이 없으면 기본적으로 fill
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setTextSize(80);
        canvas.drawText("TEXT STROKE", 100, 900, paint); // 출력 문자와 위치를 적어야한다.

    }
}
