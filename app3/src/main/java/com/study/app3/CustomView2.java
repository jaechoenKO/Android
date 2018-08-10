package com.study.app3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

// bitmap 처리
public class CustomView2 extends View {

    public CustomView2(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.CYAN);

        Paint paint = new Paint();

        // bitmap 처리를 위한 Resources
//        Resources res = getResources();
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) res.getDrawable(R.drawable.chiken);
//        Bitmap bitmap = bitmapDrawable.getBitmap();

        // 위의 방법은 불편하다. factory를 사용하면 편하다.
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        // canvas로 이용하면 된다.
//        canvas.drawBitmap(bitmap, 10, 10, null);

        // bitmap가지고 shader를 준다. REPEAT 반복한다
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        // shader에 bitmapshader를 적용할 수 있다.
        paint.setShader(bitmapShader);

        canvas.drawRect(10, 10, 800, 800, paint);


    }

}
