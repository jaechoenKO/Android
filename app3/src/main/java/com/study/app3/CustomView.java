package com.study.app3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

public class CustomView extends View {

    public CustomView(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas){

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        int[] colors = {Color.BLUE, Color.RED, Color.YELLOW, Color.MAGENTA};

        // paint.setShader(new LinearGradient(0,0, 100,0, Color.RED, Color.YELLOW, Shader.TileMode.CLAMP));

        // 객체화를 시켜 넣어도 된다.
        // 타일 처리 방식. 즉 그라데이션.
        LinearGradient linearGradient = new LinearGradient(10,10, 200,0, Color.RED, Color.YELLOW, Shader.TileMode.CLAMP);
        LinearGradient linearGradient2 = new LinearGradient(10,10, 210,410, Color.GREEN, Color.RED, Shader.TileMode.CLAMP);
        LinearGradient linearGradient3 = new LinearGradient(10,420, 210,620, colors, null, Shader.TileMode.CLAMP);

        paint.setShader(linearGradient);
        canvas.drawRect(10, 10, 200, 200, paint);

        paint.setShader(linearGradient2);
        canvas.drawRect(10, 210, 210, 410, paint);

        paint.setShader(linearGradient3);
        canvas.drawRect(10, 420, 210, 620, paint);

        canvas.drawCircle(420, 220, 100, paint);

    }

}
